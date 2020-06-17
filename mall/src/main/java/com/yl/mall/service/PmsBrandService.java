package com.yl.mall.service;

import com.yl.mall.entity.PmsBrand;

import java.math.BigDecimal;
import java.util.List;

/**
 * @version: 1.00.00
 * @description:
 * @copyright: Copyright (c) 2019  All Rights Reserved
 * @company:
 * @author: yl
 * @date: 2020/6/12 15:55
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    void insertBrand(PmsBrand pmsBrand);

    void deleteBrand(BigDecimal id);

    void updateBrand(PmsBrand pmsBrand);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand queryBrand(BigDecimal id);
}
