package com.yl.mall.dao;

import com.yl.mall.po.PmsBrand;
import com.yl.mall.po.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsBrandMapper {
    long countByExample(PmsBrandExample example);

    int deleteByExample(PmsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);
}