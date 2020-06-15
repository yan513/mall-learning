package com.yl.mall.dao;

import com.yl.mall.po.Databasechangeloglock;
import com.yl.mall.po.DatabasechangeloglockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatabasechangeloglockMapper {
    long countByExample(DatabasechangeloglockExample example);

    int deleteByExample(DatabasechangeloglockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Databasechangeloglock record);

    int insertSelective(Databasechangeloglock record);

    List<Databasechangeloglock> selectByExample(DatabasechangeloglockExample example);

    Databasechangeloglock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Databasechangeloglock record, @Param("example") DatabasechangeloglockExample example);

    int updateByExample(@Param("record") Databasechangeloglock record, @Param("example") DatabasechangeloglockExample example);

    int updateByPrimaryKeySelective(Databasechangeloglock record);

    int updateByPrimaryKey(Databasechangeloglock record);
}