package com.yl.mall.service;

import com.yl.mall.po.PmsBrand;

import java.util.List;

/**
 * @version: 1.00.00
 * @description:
 * @copyright: Copyright (c) 2019 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: yanlin
 * @date: 2020/6/12 15:55
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    void insertBrand(PmsBrand pmsBrand);

    void deleteBrand(Long id);

    void updateBrand(PmsBrand pmsBrand);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand queryBrand(Long id);
}
