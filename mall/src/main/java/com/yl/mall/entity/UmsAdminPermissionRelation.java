package com.yl.mall.entity;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)实体类
 *
 * @author makejava
 * @since 2020-06-17 14:55:38
 */
public class UmsAdminPermissionRelation {
        
    private BigDecimal id;
        
    private BigDecimal adminId;
        
    private BigDecimal permissionId;
        
    private Integer type;

        
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
        
    public BigDecimal getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(BigDecimal permissionId) {
        this.permissionId = permissionId;
    }
        
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}