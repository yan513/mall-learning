package com.yl.mall.service.impl;

import com.yl.mall.entity.UmsAdminRoleRelation;
import com.yl.mall.dao.UmsAdminRoleRelationDao;
import com.yl.mall.service.UmsAdminRoleRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-06-17 14:55:16
 */
@Service("umsAdminRoleRelationService")
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService {
    @Resource
    private UmsAdminRoleRelationDao umsAdminRoleRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdminRoleRelation queryById(BigDecimal id) {
        return this.umsAdminRoleRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsAdminRoleRelation> queryAllByLimit(int offset, int limit) {
        return this.umsAdminRoleRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdminRoleRelation insert(UmsAdminRoleRelation umsAdminRoleRelation) {
        this.umsAdminRoleRelationDao.insert(umsAdminRoleRelation);
        return umsAdminRoleRelation;
    }

    /**
     * 修改数据
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdminRoleRelation update(UmsAdminRoleRelation umsAdminRoleRelation) {
        this.umsAdminRoleRelationDao.update(umsAdminRoleRelation);
        return this.queryById(umsAdminRoleRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigDecimal id) {
        return this.umsAdminRoleRelationDao.deleteById(id) > 0;
    }
}