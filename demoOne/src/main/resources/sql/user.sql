/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2019-04-23 17:25:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL COMMENT '名字',
  `password` varchar(15) DEFAULT NULL,
  `phone` varchar(33) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `creation_time` date DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `sexual` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王长贵', '123456', '15529829280', '759201272@qq.com', '2019-03-05', '20', '男');
INSERT INTO `user` VALUES ('2', '王富贵', '123456', '15585658598', '123456879@qq.com', '2019-04-09', '30', '女');
INSERT INTO `user` VALUES ('3', '王金贵', '123456', '15802985698', '125987@qq.com', '2019-04-13', '55', '男');
INSERT INTO `user` VALUES ('4', '王足贵', '123456', '13358975698', '321654@qq.com', '2019-04-12', '28', '男');
INSERT INTO `user` VALUES ('5', '王卿贵', '123456', '15536859875', '123446@qq.com', '2019-04-10', '25', '女');
INSERT INTO `user` VALUES ('6', '小于', '123456', null, null, '2019-04-23', '0', null);
