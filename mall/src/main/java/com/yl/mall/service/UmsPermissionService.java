package com.yl.mall.service;

import com.yl.mall.entity.UmsPermission;

import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户权限表(UmsPermission)表服务接口
 *
 * @author makejava
 * @since 2020-06-17 11:11:50
 */
public interface UmsPermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsPermission queryById(BigDecimal id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsPermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    UmsPermission insert(UmsPermission umsPermission);

    /**
     * 修改数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    UmsPermission update(UmsPermission umsPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(BigDecimal id);

    /**
     * 通过用户id查找权限列表
     *
     * @param id 用户id
     * @return 是否成功
     */
    List<UmsPermission> getPermissionList(BigDecimal id);
}