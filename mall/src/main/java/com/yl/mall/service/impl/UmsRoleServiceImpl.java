package com.yl.mall.service.impl;

import com.yl.mall.entity.UmsRole;
import com.yl.mall.dao.UmsRoleDao;
import com.yl.mall.service.UmsRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户角色表(UmsRole)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 14:54:52
 */
@Service("umsRoleService")
public class UmsRoleServiceImpl implements UmsRoleService {
    @Resource
    private UmsRoleDao umsRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRole queryById(BigDecimal id) {
        return this.umsRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsRole> queryAllByLimit(int offset, int limit) {
        return this.umsRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRole insert(UmsRole umsRole) {
        this.umsRoleDao.insert(umsRole);
        return umsRole;
    }

    /**
     * 修改数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRole update(UmsRole umsRole) {
        this.umsRoleDao.update(umsRole);
        return this.queryById(umsRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigDecimal id) {
        return this.umsRoleDao.deleteById(id) > 0;
    }
}