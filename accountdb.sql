/*
Navicat MySQL Data Transfer

Source Server         : Mysql60
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : accountdb

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2016-12-17 20:17:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `status` char(1) DEFAULT '0',
  `newtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `lastlogintime` datetime DEFAULT NULL,
  `acctype_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `acctype_id` (`acctype_id`),
  CONSTRAINT `acctype_id` FOREIGN KEY (`acctype_id`) REFERENCES `acctype` (`acctype_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for acctype
-- ----------------------------
DROP TABLE IF EXISTS `acctype`;
CREATE TABLE `acctype` (
  `acctype_id` int(11) NOT NULL,
  `acctype` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`acctype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
