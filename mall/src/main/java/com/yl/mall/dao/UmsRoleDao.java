package com.yl.mall.dao;

import com.yl.mall.entity.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户角色表(UmsRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-17 14:54:52
 */
public interface UmsRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRole queryById(BigDecimal id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsRole 实例对象
     * @return 对象列表
     */
    List<UmsRole> queryAll(UmsRole umsRole);

    /**
     * 新增数据
     *
     * @param umsRole 实例对象
     * @return 影响行数
     */
    int insert(UmsRole umsRole);

    /**
     * 修改数据
     *
     * @param umsRole 实例对象
     * @return 影响行数
     */
    int update(UmsRole umsRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(BigDecimal id);

}