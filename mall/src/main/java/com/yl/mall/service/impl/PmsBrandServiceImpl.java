package com.yl.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.yl.mall.dao.PmsBrandMapper;
import com.yl.mall.po.PmsBrand;
import com.yl.mall.po.PmsBrandExample;
import com.yl.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version: 1.00.00
 * @description:
 * @copyright: Copyright (c) 2019 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: yanlin
 * @date: 2020/6/12 15:56
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public void insertBrand(PmsBrand pmsBrand) {
        brandMapper.insert(pmsBrand);
    }

    @Override
    public void deleteBrand(Long id) {
        brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateBrand(PmsBrand pmsBrand) {
        brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand queryBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
