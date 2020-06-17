package com.yl.mall.entity;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)实体类
 *
 * @author makejava
 * @since 2020-06-17 14:55:16
 */
public class UmsAdminRoleRelation {
        
    private BigDecimal id;
        
    private BigDecimal adminId;
        
    private BigDecimal roleId;

        
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
        
    public BigDecimal getAdminId() {
        return adminId;
    }

    public void setAdminId(BigDecimal adminId) {
        this.adminId = adminId;
    }
        
    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

}