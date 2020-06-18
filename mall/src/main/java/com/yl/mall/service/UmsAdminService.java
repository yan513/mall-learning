package com.yl.mall.service;

import com.yl.mall.dto.UmsAdminLoginParam;
import com.yl.mall.entity.UmsAdmin;
import com.yl.mall.entity.UmsPermission;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 后台用户表(UmsAdmin)表服务接口
 *
 * @author makejava
 * @since 2020-06-17 11:11:00
 */
public interface UmsAdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdmin queryById(BigDecimal id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsAdmin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    UmsAdmin insert(UmsAdmin umsAdmin);

    /**
     * 修改数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    UmsAdmin update(UmsAdmin umsAdmin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(BigDecimal id);

    /**
     * 通过用户名查找对象
     *
     * @param username 用户名
     * @return 是否成功
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param loginParam 登录信息
     * @return 生成的JWT的token
     */
    Map<String, String> login(UmsAdminLoginParam loginParam);
}