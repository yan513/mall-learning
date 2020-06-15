package com.yl.mall.dao;

import com.yl.mall.po.Databasechangelog;
import com.yl.mall.po.DatabasechangelogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatabasechangelogMapper {
    long countByExample(DatabasechangelogExample example);

    int deleteByExample(DatabasechangelogExample example);

    int insert(Databasechangelog record);

    int insertSelective(Databasechangelog record);

    List<Databasechangelog> selectByExample(DatabasechangelogExample example);

    int updateByExampleSelective(@Param("record") Databasechangelog record, @Param("example") DatabasechangelogExample example);

    int updateByExample(@Param("record") Databasechangelog record, @Param("example") DatabasechangelogExample example);
}