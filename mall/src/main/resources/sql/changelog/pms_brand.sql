--liquibase formatted sql
--changeset yl:pms_brand_1.0.0.0

DROP TABLE IF EXISTS `pms_brand`;

CREATE TABLE IF NOT EXISTS `pms_brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `first_letter` varchar(4) DEFAULT NULL COMMENT '首字母',
  `factory_status` tinyint(1) DEFAULT NULL COMMENT '是否为品牌制造商:0->不是 1->是',
  `product_count` bigint(20) DEFAULT NULL COMMENT '产品数量',
  `product_comment_count` bigint(20) DEFAULT NULL COMMENT '产品评论数量',
  `show_status` tinyint(1) DEFAULT NULL COMMENT '展示状态',
  `logo` varchar(100) DEFAULT NULL COMMENT '品牌logo',
  `big_pic` varchar(100) DEFAULT NULL COMMENT '专区大图',
  `brand_story` varchar(1000) DEFAULT NULL COMMENT '品牌故事',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='品牌表';
