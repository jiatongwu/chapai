/*
Navicat MySQL Data Transfer

Source Server         : fh.xinkaoyun.com
Source Server Version : 50726
Source Host           : fh.xinkaoyun.com:3306
Source Database       : fuxing_school

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-07-02 19:28:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for map_table
-- ----------------------------
DROP TABLE IF EXISTS `map_table`;
CREATE TABLE `map_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key` varchar(100) NOT NULL,
  `value` varchar(4000) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `map_table_UN` (`key`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of map_table
-- ----------------------------
INSERT INTO `map_table` VALUES ('1', 'zhaoShengRenshuKey', '300');
INSERT INTO `map_table` VALUES ('2', 'zhaoShengStartTimeKey', '2019-07-04 00:00:07');
INSERT INTO `map_table` VALUES ('3', 'zhaoShengEndTimeKey', '2019-07-04 23:59:59');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '平台权限菜单id',
  `parent_id` int(11) DEFAULT '0' COMMENT 'pid',
  `name` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '菜单名称',
  `describe` varchar(160) COLLATE utf8_bin DEFAULT '' COMMENT '菜单描述',
  `url` varchar(1000) COLLATE utf8_bin DEFAULT '' COMMENT '菜单URL',
  `icon` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '图标',
  `num` int(2) DEFAULT '0' COMMENT '排序字段',
  `code` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '菜单代码',
  `spread` varchar(16) COLLATE utf8_bin DEFAULT 'false' COMMENT '是否展开',
  `attribute` int(1) DEFAULT '1' COMMENT '菜单属性  1：后台  2：。。。',
  `type` int(1) DEFAULT '0' COMMENT '菜单类型 0：目录 1：菜单  2：按钮',
  `level` int(6) DEFAULT '0' COMMENT '菜单深度',
  `time` varchar(32) COLLATE utf8_bin DEFAULT '',
  `checked` int(1) DEFAULT '2',
  PRIMARY KEY (`id`),
  UNIQUE KEY `permission_code_uk` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=182 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(32) COLLATE utf8_bin DEFAULT '' COMMENT '名称',
  `code` varchar(32) COLLATE utf8_bin DEFAULT '' COMMENT '值',
  `describe` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '描述',
  `time` varchar(32) COLLATE utf8_bin DEFAULT '' COMMENT '时间',
  `state` int(1) DEFAULT '1' COMMENT '状态  1：可用 2：禁用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_code_uk` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('163', '学生家长角色', 'student_parent', '', '', '1');
INSERT INTO `role` VALUES ('164', '学校管理员角色', 'school_manager', '', '', '1');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单角色id',
  `permission_id` int(11) DEFAULT NULL COMMENT '菜单id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `menu_attribute` int(2) DEFAULT '1' COMMENT '菜单属性',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2015 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for signup
-- ----------------------------
DROP TABLE IF EXISTS `signup`;
CREATE TABLE `signup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fixed_house` varchar(100) NOT NULL COMMENT '固定住房 填 是或否',
  `name` varchar(100) NOT NULL COMMENT '学生姓名',
  `birthday` varchar(100) NOT NULL COMMENT '出生年月',
  `census` varchar(100) NOT NULL COMMENT '户籍 填展示的字符串',
  `account_location` varchar(1000) NOT NULL COMMENT '户口所在地',
  `father` varchar(1000) NOT NULL COMMENT '父亲姓名',
  `mother` varchar(1000) NOT NULL COMMENT '母亲姓名',
  `father_workunit` varchar(1000) NOT NULL COMMENT '父亲工作单位',
  `mother_workunit` varchar(1000) NOT NULL COMMENT '母亲工作单位',
  `phone` varchar(100) NOT NULL COMMENT '手机号',
  `address` varchar(1000) NOT NULL COMMENT '固定住址',
  `gender` varchar(100) NOT NULL COMMENT '性别 填男或女',
  `first_trial` int(11) DEFAULT NULL COMMENT '初审状态 1代表通过 2代表不通过',
  `first_trial_information` varchar(1000) DEFAULT NULL COMMENT '初审意见',
  `census_image_files` varchar(4000) DEFAULT NULL COMMENT '孩子户口页图片 ',
  `birth_certificate_image_files` varchar(4000) DEFAULT NULL COMMENT ' 出生证明图片 ',
  `house_ceritificate_image_files` varchar(4000) DEFAULT NULL COMMENT '处区内购买固定房产证明图片,多张图片用逗号分隔',
  `idcard` varchar(100) NOT NULL COMMENT '身份证号',
  `reg_code` int(20) DEFAULT NULL COMMENT '报名号',
  `first_trial_user_id` int(11) DEFAULT NULL COMMENT '审核人',
  `first_trial_datetime` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `birthday_date` date DEFAULT NULL,
  `empty_regcode_user_id` int(11) DEFAULT NULL,
  `regenerator_regcode_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `signup_idcard_UN` (`idcard`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of signup
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户表',
  `username` varchar(16) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '登录用户名',
  `password` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '密码',
  `name` varchar(16) COLLATE utf8_bin DEFAULT '' COMMENT '名称',
  `extend` varchar(32) COLLATE utf8_bin DEFAULT '' COMMENT '扩展字段',
  `type` int(2) DEFAULT '1' COMMENT '用户类型 0：超级管理  1：管理',
  `salt` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_UN` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=176 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('65', '13831868992', '苑明伟13831868992', '苑明伟', '', '1', '苑明伟13831868992');
INSERT INTO `user` VALUES ('66', '13932835557', '贾娜13932835557', '贾娜', '', '1', '贾娜13932835557');
INSERT INTO `user` VALUES ('67', '15031826651', '郝素讷15031826651', '郝素讷', '', '1', '郝素讷15031826651');
INSERT INTO `user` VALUES ('68', '13785847337', '张静13785847337', '张静', '', '1', '张静13785847337');
INSERT INTO `user` VALUES ('69', '15903183582', '于芳15903183582', '于芳', '', '1', '于芳15903183582');
INSERT INTO `user` VALUES ('70', '15131816811', '15131816811孙爱娟', '孙爱娟', '', '1', '15131816811孙爱娟');
INSERT INTO `user` VALUES ('71', '15512974390', '15512974390', '测试用户吴', '', '1', '15512974390');
INSERT INTO `user` VALUES ('72', '18632831023', '+86-18632831023', '测试用户左', '', '1', '+86-18632831023');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_role_UN` (`user_id`,`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=228 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('114', '65', '164');
INSERT INTO `user_role` VALUES ('115', '66', '164');
INSERT INTO `user_role` VALUES ('116', '67', '164');
INSERT INTO `user_role` VALUES ('117', '68', '164');
INSERT INTO `user_role` VALUES ('118', '69', '164');
INSERT INTO `user_role` VALUES ('119', '70', '164');
INSERT INTO `user_role` VALUES ('125', '71', '164');
INSERT INTO `user_role` VALUES ('121', '72', '164');
