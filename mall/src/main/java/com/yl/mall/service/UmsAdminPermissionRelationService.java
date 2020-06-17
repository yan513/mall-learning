package com.yl.mall.service;

import com.yl.mall.entity.UmsAdminPermissionRelation;

import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表服务接口
 *
 * @author makejava
 * @since 2020-06-17 14:55:38
 */
public interface UmsAdminPermissionRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdminPermissionRelation queryById(BigDecimal id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsAdminPermissionRelation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsAdminPermissionRelation 实例对象
     * @return 实例对象
     */
    UmsAdminPermissionRelation insert(UmsAdminPermissionRelation umsAdminPermissionRelation);

    /**
     * 修改数据
     *
     * @param umsAdminPermissionRelation 实例对象
     * @return 实例对象
     */
    UmsAdminPermissionRelation update(UmsAdminPermissionRelation umsAdminPermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(BigDecimal id);

}