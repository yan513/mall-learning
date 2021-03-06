package com.yl.mall.controller;

import com.yl.mall.common.api.CommonResult;
import com.yl.mall.entity.PmsBrand;
import com.yl.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * @version: 1.00.00
 * @description:品牌管理controller
 * @copyright: Copyright (c) 2020 All Rights Reserved
 * @author: yl
 * @date: 2020/6/12 15:55
 */
@Api(tags = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation("获取所有品牌列表")
    @GetMapping("/listAll")
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<List<PmsBrand>> getBrandList() {

        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    @ApiOperation("添加品牌")
    @PostMapping("/create")
    public CommonResult createBrand(@RequestBody @Valid PmsBrand pmsBrand) {
        pmsBrandService.insertBrand(pmsBrand);
        return CommonResult.success(pmsBrand);
    }
}
