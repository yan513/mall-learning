package com.yl.mall.service.impl;

import com.yl.mall.common.exception.BusinessException;
import com.yl.mall.common.exception.CodeConstant;
import com.yl.mall.common.utils.JwtTokenUtil;
import com.yl.mall.dao.UmsAdminPermissionRelationDao;
import com.yl.mall.dao.UmsPermissionDao;
import com.yl.mall.dto.UmsAdminLoginParam;
import com.yl.mall.entity.UmsAdmin;
import com.yl.mall.dao.UmsAdminDao;
import com.yl.mall.entity.UmsAdminPermissionRelation;
import com.yl.mall.entity.UmsPermission;
import com.yl.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户表(UmsAdmin)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 11:11:00
 */
@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Resource
    private UmsAdminDao umsAdminDao;
    @Resource
    private UmsPermissionDao umsPermissionDao;
    @Resource
    private UmsAdminPermissionRelationDao umsAdminPermissionRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdmin queryById(BigDecimal id) {
        return this.umsAdminDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsAdmin> queryAllByLimit(int offset, int limit) {
        return this.umsAdminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin insert(UmsAdmin umsAdmin) {
        this.umsAdminDao.insert(umsAdmin);
        return umsAdmin;
    }

    /**
     * 修改数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin update(UmsAdmin umsAdmin) {
        this.umsAdminDao.update(umsAdmin);
        return this.queryById(umsAdmin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigDecimal id) {
        return this.umsAdminDao.deleteById(id) > 0;
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        return umsAdminDao.selectByCondition(map);
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        //查询用户名是否存在
        UmsAdmin umsAdmin1 = getAdminByUsername(umsAdminParam.getUsername());
        if (umsAdmin1 != null) {
            throw new  BusinessException(CodeConstant.Http.EXECUTE_FAIL, "用户名已存在");
        }
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //密码加密
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        umsAdminDao.insert(umsAdmin);
        return null;
    }

    @Override
    public Map<String, String> login(UmsAdminLoginParam loginParam) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(loginParam.getUsername());
            if (!passwordEncoder.matches(loginParam.getPassword(), userDetails.getPassword())) {
                throw new BusinessException(CodeConstant.Http.EXECUTE_FAIL, "密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
            throw new BusinessException(CodeConstant.Http.EXECUTE_FAIL, "登录异常：" + e.getMessage());
        }
        if (token == null) {
            throw new BusinessException(CodeConstant.Http.EXECUTE_FAIL, "登录异常：获取不到token");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        return tokenMap;
    }

}