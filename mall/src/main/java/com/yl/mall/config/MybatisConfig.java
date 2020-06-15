package com.yl.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version: 1.00.00
 * @description:mybatis dao层配置
 * @copyright: Copyright (c) 2019 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: yanlin
 * @date: 2020/6/12 15:13
 */
@Configuration
@MapperScan("com.yl.mall.dao")
public class MybatisConfig {
}
