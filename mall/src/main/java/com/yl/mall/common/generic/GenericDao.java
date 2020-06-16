package com.yl.mall.common.generic;

import java.util.List;
import java.util.Map;

/**
 * @version: 1.0.0
 * @description: 所有自定义Dao的顶级接口， 封装常用的增删查改操作
 *               可以通过Mybatis Generator Maven 插件自动生成Dao,
 *   			 也可以手动编码,然后继承GenericDao 即可.
 *  			 Model : 代表数据库中的表 映射的Java对象类型
 *  			 PK :代表对象的主键类型
 * @copyright: Copyright (c) 2020 All Rights Reserved
 * @author: yl
 * @date: 2020/6/16 1:53 下午
 */
public interface GenericDao<Model, PK> {
    /**
     * 插入对象
     * @param model
     * @return
     */
    int insert(Model model);

    /**
     * 更新对象
     * @param model
     * @return
     */
    int update(Model model);

    /**
     * 删除对象（根据主键）
     * @param id
     * @return
     */
    int deleteById(PK id);

    /**
     * 查询对象（根据主键）
     * @param id
     * @return
     */
    Model selectById(PK id);

    /**
     * 查询一条记录
     * @param params
     * @return
     */
    Model selectOne(Map<String, Object> params);

    /**
     * 查询所有对象
     * @param params
     * @return
     */
    List<Model> selectList(Map<String, Object> params);
}
