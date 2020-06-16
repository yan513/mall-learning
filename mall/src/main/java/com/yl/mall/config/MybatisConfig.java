package com.yl.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version: 1.00.00
 * @description: mybatis dao层配置
 * @copyright: Copyright (c) 2020  All Rights Reserved
 * @company:
 * @author: yl
 * @date: 2020/6/12 15:13
 */
@Configuration
@MapperScan("com.yl.mall.dao")
public class MybatisConfig {
}
