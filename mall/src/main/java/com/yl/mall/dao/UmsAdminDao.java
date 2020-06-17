package com.yl.mall.dao;

import com.yl.mall.entity.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 后台用户表(UmsAdmin)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-17 11:11:00
 */
public interface UmsAdminDao {
    /**
     * 条件查询
     * @param map 条件
     * @return 对象
     */
    UmsAdmin selectByCondition(Map<String, Object> map);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdmin queryById(BigDecimal id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsAdmin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsAdmin 实例对象
     * @return 对象列表
     */
    List<UmsAdmin> queryAll(UmsAdmin umsAdmin);

    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 影响行数
     */
    int insert(UmsAdmin umsAdmin);

    /**
     * 修改数据
     *
     * @param umsAdmin 实例对象
     * @return 影响行数
     */
    int update(UmsAdmin umsAdmin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(BigDecimal id);
}