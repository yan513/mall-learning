package com.yl.mall.controller;

import com.yl.mall.common.api.CommonResult;
import com.yl.mall.po.PmsBrand;
import com.yl.mall.service.PmsBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @version: 1.00.00
 * @description:品牌管理controller
 * @copyright: Copyright (c) 2019 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: yanlin
 * @date: 2020/6/12 15:55
 */
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> getBrandList() {

        return CommonResult.success(pmsBrandService.listAllBrand());
    }
}
