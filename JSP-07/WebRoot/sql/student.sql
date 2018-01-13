/*
Navicat MySQL Data Transfer

Source Server         : Tiffany
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : yiki

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-12-25 18:40:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('4', '点对点', '4');
INSERT INTO `student` VALUES ('5', 'ddf', '4');
INSERT INTO `student` VALUES ('6', '李伊琪', '18');
INSERT INTO `student` VALUES ('7', 'ddf', '18');
INSERT INTO `student` VALUES ('8', 'ttt', '1');
INSERT INTO `student` VALUES ('9', '李伊琪', '4');
INSERT INTO `student` VALUES ('10', 'ddf', '18');
INSERT INTO `student` VALUES ('11', 'ddf', '18');
INSERT INTO `student` VALUES ('12', 'ddf', '18');
INSERT INTO `student` VALUES ('13', 'ddf', '18');
INSERT INTO `student` VALUES ('14', 'hhhh', '4');
INSERT INTO `student` VALUES ('15', 'hhhh', '4');
