package com.yl.mall.service.impl;

import com.yl.mall.entity.UmsAdminPermissionRelation;
import com.yl.mall.dao.UmsAdminPermissionRelationDao;
import com.yl.mall.service.UmsAdminPermissionRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 14:55:38
 */
@Service("umsAdminPermissionRelationService")
public class UmsAdminPermissionRelationServiceImpl implements UmsAdminPermissionRelationService {
    @Resource
    private UmsAdminPermissionRelationDao umsAdminPermissionRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdminPermissionRelation queryById(BigDecimal id) {
        return this.umsAdminPermissionRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsAdminPermissionRelation> queryAllByLimit(int offset, int limit) {
        return this.umsAdminPermissionRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsAdminPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdminPermissionRelation insert(UmsAdminPermissionRelation umsAdminPermissionRelation) {
        this.umsAdminPermissionRelationDao.insert(umsAdminPermissionRelation);
        return umsAdminPermissionRelation;
    }

    /**
     * 修改数据
     *
     * @param umsAdminPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdminPermissionRelation update(UmsAdminPermissionRelation umsAdminPermissionRelation) {
        this.umsAdminPermissionRelationDao.update(umsAdminPermissionRelation);
        return this.queryById(umsAdminPermissionRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigDecimal id) {
        return this.umsAdminPermissionRelationDao.deleteById(id) > 0;
    }
}