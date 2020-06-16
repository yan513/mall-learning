package com.yl.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.yl.mall.dao.PmsBrandDao;
import com.yl.mall.po.PmsBrandPO;
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
    public List<PmsBrandPO> listAllBrand() {
        Map<String, Object> params = new HashMap<>();
        return brandDao.selectList(params);
    }

    @Override
    public void insertBrand(PmsBrandPO pmsBrandPO) {
        brandDao.insert(pmsBrandPO);
    }

    @Override
    public void deleteBrand(BigDecimal id) {
        brandDao.deleteById(id);
    }

    @Override
    public void updateBrand(PmsBrandPO pmsBrandPO) {
        brandDao.update(pmsBrandPO);
    }

    @Override
    public List<PmsBrandPO> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Map<String, Object> params = new HashMap<>();
        List<PmsBrandPO> pmsBrandPOList = brandDao.selectList(params);
        return pmsBrandPOList;
    }

    @Override
    public PmsBrandPO queryBrand(BigDecimal id) {
        return brandDao.selectById(id);
    }
}
