package com.yl.mall.service;

import com.yl.mall.po.PmsBrandPO;

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
    List<PmsBrandPO> listAllBrand();

    void insertBrand(PmsBrandPO pmsBrandPO);

    void deleteBrand(BigDecimal id);

    void updateBrand(PmsBrandPO pmsBrandPO);

    List<PmsBrandPO> listBrand(int pageNum, int pageSize);

    PmsBrandPO queryBrand(BigDecimal id);
}
