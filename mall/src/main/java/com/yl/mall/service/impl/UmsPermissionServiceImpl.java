package com.yl.mall.service.impl;

import com.yl.mall.entity.UmsPermission;
import com.yl.mall.dao.UmsPermissionDao;
import com.yl.mall.service.UmsPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户权限表(UmsPermission)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 11:11:50
 */
@Service("umsPermissionService")
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Resource
    private UmsPermissionDao umsPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsPermission queryById(BigDecimal id) {
        return this.umsPermissionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsPermission> queryAllByLimit(int offset, int limit) {
        return this.umsPermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission insert(UmsPermission umsPermission) {
        this.umsPermissionDao.insert(umsPermission);
        return umsPermission;
    }

    /**
     * 修改数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission update(UmsPermission umsPermission) {
        this.umsPermissionDao.update(umsPermission);
        return this.queryById(umsPermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigDecimal id) {
        return this.umsPermissionDao.deleteById(id) > 0;
    }

    @Override
    public List<UmsPermission> getPermissionList(BigDecimal id) {
        Map<String, Object> map = new HashMap<>();
        map.put("adminId", id);
        return umsPermissionDao.selectByCondition(map);
    }
}