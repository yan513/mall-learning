package com.yl.mall.entity;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)实体类
 *
 * @author makejava
 * @since 2020-06-17 14:56:01
 */
public class UmsRolePermissionRelation {
        
    private BigDecimal id;
        
    private BigDecimal roleId;
        
    private BigDecimal permissionId;

        
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
        
    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }
        
    public BigDecimal getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(BigDecimal permissionId) {
        this.permissionId = permissionId;
    }

}