/*
Navicat MySQL Data Transfer

Source Server         : Tiffany
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : yiki

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-12-30 11:36:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` char(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('李伊琪', '1234567');
INSERT INTO `user` VALUES ('卡拉胶', '123');
INSERT INTO `user` VALUES ('q', '123');
INSERT INTO `user` VALUES ('李伊琪', '123456');
INSERT INTO `user` VALUES ('你好', '123');
INSERT INTO `user` VALUES ('微微', '123');
INSERT INTO `user` VALUES ('w', '123');
INSERT INTO `user` VALUES ('你好e', '123');
INSERT INTO `user` VALUES ('你好e', '123');
