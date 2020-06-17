package com.yl.mall.dao;

import com.yl.mall.entity.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-17 14:56:01
 */
public interface UmsRolePermissionRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRolePermissionRelation queryById(BigDecimal id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRolePermissionRelation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 对象列表
     */
    List<UmsRolePermissionRelation> queryAll(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 影响行数
     */
    int insert(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 修改数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 影响行数
     */
    int update(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(BigDecimal id);

}