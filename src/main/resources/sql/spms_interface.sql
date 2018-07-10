/*
Navicat MySQL Data Transfer

Source Server         : hello
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : interface_management

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-07-10 15:28:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for spms_interface
-- ----------------------------
DROP TABLE IF EXISTS `spms_interface`;
CREATE TABLE `spms_interface` (
  `interface_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '接口ID',
  `interface_name` varchar(50) DEFAULT NULL COMMENT '接口名称',
  `request_method` varchar(50) DEFAULT NULL COMMENT '请求方式',
  `request_path` varchar(20) DEFAULT NULL COMMENT '请求路径',
  `latest_updater` varchar(20) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `request_parameter` varchar(255) DEFAULT NULL COMMENT '请求参数',
  `response_parameter` varchar(255) DEFAULT NULL COMMENT '返回参数',
  PRIMARY KEY (`interface_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of spms_interface
-- ----------------------------
INSERT INTO `spms_interface` VALUES ('2', 'delete', 'http://localhost:8080/delete', 'lisi', '2018-07-25', '2018-07-18', null, null);
INSERT INTO `spms_interface` VALUES ('3', 'update', 'http://localhost:8080/update', 'wangwu', '2018-07-06', '2018-08-03', null, null);
INSERT INTO `spms_interface` VALUES ('4', 'select', 'http://localhost:8080/select', 'zhaoliu', '2018-07-20', '2018-07-19', null, null);
INSERT INTO `spms_interface` VALUES ('5', 'eee', 'eee', 'eee', 'green', '2018-08-01', 'eee', 'eee');
INSERT INTO `spms_interface` VALUES ('6', 'bbb', 'bbb', 'bbb', 'bbb', '2018-07-13', 'bbb', 'bbb');
INSERT INTO `spms_interface` VALUES ('15', 'ddd', 'ddd', 'dd', 'dd', 'dd', 'dd', 'dd');
INSERT INTO `spms_interface` VALUES ('16', 'rrr', 'rrr', 'rrr', 'rrr', 'rrr', 'rrr', 'rrr');
