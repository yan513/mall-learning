package com.yl.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.yl.mall.dao.PmsBrandDao;
import com.yl.mall.entity.PmsBrand;
import com.yl.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version: 1.00.00
 * @description:
 * @copyright: Copyright (c) 2019  All Rights Reserved
 * @company:
 * @author: yl
 * @date: 2020/6/12 15:56
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandDao brandDao;

    @Override
    public List<PmsBrand> listAllBrand() {
        Map<String, Object> params = new HashMap<>();
        return brandDao.selectList(params);
    }

    @Override
    public void insertBrand(PmsBrand pmsBrand) {
        brandDao.insert(pmsBrand);
    }

    @Override
    public void deleteBrand(BigDecimal id) {
        brandDao.deleteById(id);
    }

    @Override
    public void updateBrand(PmsBrand pmsBrand) {
        brandDao.update(pmsBrand);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Map<String, Object> params = new HashMap<>();
        List<PmsBrand> pmsBrandList = brandDao.selectList(params);
        return pmsBrandList;
    }

    @Override
    public PmsBrand queryBrand(BigDecimal id) {
        return brandDao.selectById(id);
    }
}
