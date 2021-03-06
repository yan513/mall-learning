package com.yl.mall.dao;

import com.yl.mall.entity.PmsBrand;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public interface PmsBrandDao {
    /**
     * 插入对象
     * @param model
     * @return
     */
    int insert(PmsBrand model);

    /**
     * 更新对象
     * @param model
     * @return
     */
    int update(PmsBrand model);

    /**
     * 删除对象（根据主键）
     * @param id
     * @return
     */
    int deleteById(BigDecimal id);

    /**
     * 查询对象（根据主键）
     * @param id
     * @return
     */
    PmsBrand selectById(BigDecimal id);

    /**
     * 查询列表
     * @param map
     * @return
     */
    List<PmsBrand> selectList(Map<String, Object> map);
}