package com.yl.mall.controller;

import com.yl.mall.common.api.CommonResult;
import com.yl.mall.dto.UmsAdminLoginParam;
import com.yl.mall.entity.UmsAdmin;
import com.yl.mall.entity.UmsPermission;
import com.yl.mall.service.UmsAdminService;
import com.yl.mall.service.UmsPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @version: 1.0.0
 * @description: 后台用户管理
 * @copyright: Copyright (c) 2020 All Rights Reserved
 * @author: yl
 * @date: 2020/6/18 8:34 上午
 */
@RestController
@Api(tags = "用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private UmsPermissionService permissionService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    @ResponseBody
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdmin umsAdminParam, BindingResult result) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping("/login")
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult result) {
        return CommonResult.success(adminService.login(umsAdminLoginParam));
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @GetMapping("/permission/{adminId}")
    @ResponseBody
    public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
        List<UmsPermission> permissionList = permissionService.getPermissionList(new BigDecimal(adminId));
        return CommonResult.success(permissionList);
    }
}
