# springboot - 1.5.1.RELEASE
1.mybatis 
create sql

DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_id` int(32) unsigned NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(100) NOT NULL,
  `trade_name` varchar(40) NOT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('1', 'test01', 'mobile', '1');
