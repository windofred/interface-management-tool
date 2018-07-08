/*
Navicat MySQL Data Transfer

Source Server         : my_connection
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : interface_management

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2018-07-08 21:30:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for spms_interface
-- ----------------------------
DROP TABLE IF EXISTS `spms_interface`;
CREATE TABLE `spms_interface` (
  `interface_id` int(11) DEFAULT NULL,
  `interface_name` varchar(50) DEFAULT NULL,
  `interface_uri` varchar(50) DEFAULT NULL,
  `latest_updater` varchar(20) DEFAULT NULL,
  `update_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of spms_interface
-- ----------------------------
INSERT INTO `spms_interface` VALUES ('1', 'insert', 'http://localhost:8080/insert', 'zhangsan', '2018-07-11');
INSERT INTO `spms_interface` VALUES ('2', 'delete', 'http://localhost:8080/delete', 'lisi', '2018-07-25');
INSERT INTO `spms_interface` VALUES ('3', 'update', 'http://localhost:8080/update', 'wangwu', '2018-07-06');
INSERT INTO `spms_interface` VALUES ('4', 'select', 'http://localhost:8080/select', 'zhaoliu', '2018-07-20');
