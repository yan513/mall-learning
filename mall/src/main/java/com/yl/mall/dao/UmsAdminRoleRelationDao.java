package com.yl.mall.dao;

import com.yl.mall.entity.UmsAdminRoleRelation;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-17 14:55:16
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdminRoleRelation queryById(BigDecimal id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsAdminRoleRelation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 对象列表
     */
    List<UmsAdminRoleRelation> queryAll(UmsAdminRoleRelation umsAdminRoleRelation);

    /**
     * 新增数据
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 影响行数
     */
    int insert(UmsAdminRoleRelation umsAdminRoleRelation);

    /**
     * 修改数据
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 影响行数
     */
    int update(UmsAdminRoleRelation umsAdminRoleRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(BigDecimal id);

}