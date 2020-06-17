package com.yl.mall.service.impl;

import com.yl.mall.dao.UmsAdminPermissionRelationDao;
import com.yl.mall.dao.UmsPermissionDao;
import com.yl.mall.entity.UmsAdmin;
import com.yl.mall.dao.UmsAdminDao;
import com.yl.mall.entity.UmsAdminPermissionRelation;
import com.yl.mall.entity.UmsPermission;
import com.yl.mall.service.UmsAdminService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
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
    public List<UmsPermission> getPermissionList(BigDecimal id) {
        Map<String, Object> map = new HashMap<>();
        map.put("adminId", id);
        umsPermissionDao.selectByCondition(map);
        return null;
    }
}