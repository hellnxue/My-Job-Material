/*
Navicat MySQL Data Transfer

Source Server         : cnpod_beta
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : um

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2015-01-14 15:39:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '1', '佳期如梦', 'content1');
INSERT INTO `article` VALUES ('2', '1', '笑傲江湖', 'content2');
INSERT INTO `article` VALUES ('3', '1', '英雄联盟', 'content3');
INSERT INTO `article` VALUES ('4', '1', '赌神', 'content4');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` varchar(50) DEFAULT NULL,
  `deptname` varchar(500) DEFAULT NULL,
  `fid` varchar(50) DEFAULT NULL,
  `deptlevel` int(10) DEFAULT NULL,
  `memo` varchar(50) DEFAULT NULL,
  `depttype` varchar(50) DEFAULT NULL,
  `adress` varchar(100) DEFAULT NULL,
  `adresstype` varchar(50) DEFAULT NULL,
  `postcode` varchar(50) DEFAULT NULL,
  `organcode` varchar(50) DEFAULT NULL,
  `isdel` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('20d66c870da14697821239dab1cd3a6e', '计划提报部门', '4a29c7324a3c4954b06689af367dacaa', '5', '计划提包部门', '部室', '', '', '', '0007001', '1');
INSERT INTO `dept` VALUES ('20d66c870da14697821239dab1cd3a6e', '计划提报部门', '4a29c7324a3c4954b06689af367dacaa', '5', '计划提包部门', '部室', '', '', '', '0007001', '1');
INSERT INTO `dept` VALUES ('0a358396ff5d4e5abc954ab31ced1b12', '安全保卫室', '89f9a66521114bd6b91c27da0b0d67b4', '2', '其他部门', '部室', '', '', '', '', '1');
INSERT INTO `dept` VALUES ('4a29c7324a3c4954b06689af367dacaa', '调度监控室', '89f9a66521114bd6b91c27da0b0d67b4', '2', '机关部室', '部室', '', '', '', 'pyddjks', '1');
INSERT INTO `dept` VALUES ('eeb66e9465da44eeb0226021d89528a8', '制成车间', '89f9a66521114bd6b91c27da0b0d67b4', '3', '\r\n\r\n生产车间', '部室', '', '', '', 'pyzccj', '1');
INSERT INTO `dept` VALUES ('06a6375f5b184c9387de42b73480bd7c', '烧成车间', '89f9a66521114bd6b91c27da0b0d67b4', '3', '\r\n\r\n生产车间', '部室', '', '', '', 'pysccj', '1');
INSERT INTO `dept` VALUES ('51f4a9e2a9cd4054a0534eac0e17c1b1', '供料车间', '89f9a66521114bd6b91c27da0b0d67b4', '3', '\r\n\r\n生产车间', '部室', '', '', '', '1231234', '1');
INSERT INTO `dept` VALUES ('5b395e9e13624a718f273c86fe265228', '公司领导', '89f9a66521114bd6b91c27da0b0d67b4', '1', '\r\n\r\n机关部室', '部室', '', '', '', '', '1');
INSERT INTO `dept` VALUES ('5f9888afb442422d806e0405c5944d34', '综合办公室', '89f9a66521114bd6b91c27da0b0d67b4', '2', '机关部室', '办公室', '', '', '', 'pyzhbgs', '1');
INSERT INTO `dept` VALUES ('70bcd1beba664feaaff6f18df50a7b95', '机电车间', '89f9a66521114bd6b91c27da0b0d67b4', '3', '\r\n\r\n生产车间', '部室', '', '', '', 'pyjdcj', '1');
INSERT INTO `dept` VALUES ('780036ab3b6b441aaf21db5fb73e0032', '安全保卫部', '89f9a66521114bd6b91c27da0b0d67b4', '6', '其他部门', '部室', '', '', '', '', '1');
INSERT INTO `dept` VALUES ('83986ecde3a9470caa7412551f1944e7', '财务管理部', '89f9a66521114bd6b91c27da0b0d67b4', '2', '机关部室', '部室', '', '', '', 'pycwglb', '1');
INSERT INTO `dept` VALUES ('aa2a78151fe84a65b5067bc433295ce9', '采供管理部', '89f9a66521114bd6b91c27da0b0d67b4', '2', '机关部室', '部室', '', '', '', 'pycgglb', '1');
INSERT INTO `dept` VALUES ('be4572bc959842b88ccb81a46e807662', '质量控制室', '89f9a66521114bd6b91c27da0b0d67b4', '2', '机关部室', '部室', '', '', '', 'pyzlkzs', '1');
INSERT INTO `dept` VALUES ('d6262e17d27040efa3ed27f8f6bc8fc6', '水泥分厂', '89f9a66521114bd6b91c27da0b0d67b4', '5', '\r\n\r\n水泥分厂', '分厂', '', '', '', '0100115', '1');
INSERT INTO `dept` VALUES ('d9b45a3738e141139371530bcbcc48e9', '市场营销部', '89f9a66521114bd6b91c27da0b0d67b4', '2', '', '部室', '', '', '', 'pyscyxb', '1');
INSERT INTO `dept` VALUES ('89f9a66521114bd6b91c27da0b0d67b4', '平阴山水水泥有限公司', '4268b320e2c94ffbae81e2f0ff59770c', '1', '', '公司', '', '', '', '01001', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(20) NOT NULL,
  `loginPwd` varchar(20) NOT NULL,
  `sex` int(1) DEFAULT '1',
  `birthday` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '小新', '123', '1', '1991-12-21 00:00:00', 'xiaoxin@yy.com');
INSERT INTO `t_user` VALUES ('2', '小强', 'ww', '1', '1932-12-01 00:00:00', 'xiaoqing@yy.com');
INSERT INTO `t_user` VALUES ('3', '小新2', '124443', '1', '1992-11-21 00:00:00', 'xiaoxin@yy.com');
INSERT INTO `t_user` VALUES ('5', '小苗', 'hdh', '0', '2014-09-09 04:09:08', '123');
INSERT INTO `t_user` VALUES ('6', 'ww', '123', '0', '2014-09-09 07:09:21', 'dd');
INSERT INTO `t_user` VALUES ('7', 'qq', 'qq', '0', '2014-09-09 10:09:14', 'qq');
INSERT INTO `t_user` VALUES ('8', 'ee', 'ee', '1', '2014-09-09 11:09:52', 'ee');
INSERT INTO `t_user` VALUES ('9', '小吧', '123', '0', '2014-09-09 27:09:41', '发');
INSERT INTO `t_user` VALUES ('10', 'qw', '123', '0', '2014-09-09 34:09:07', 'w');
INSERT INTO `t_user` VALUES ('11', 'ww', '23', '1', '2014-09-09 34:09:07', 'werw');
INSERT INTO `t_user` VALUES ('12', 'hell', '123', '1', '2015-01-14 38:14:46', '23');
