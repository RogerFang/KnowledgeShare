/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50624
Source Host           : 127.0.0.1:3306
Source Database       : knowledge_share

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-07-30 23:07:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
  `id` int(11) NOT NULL,
  `question_id` int(11) DEFAULT NULL COMMENT '回答对应的问题id',
  `content` varchar(15000) DEFAULT NULL COMMENT '回答的内容',
  `approval_num` int(11) DEFAULT NULL COMMENT '赞同数',
  `replyer_id` int(11) DEFAULT NULL COMMENT '问题回答的用户id',
  `create_time` datetime DEFAULT NULL,
  `text1` varchar(255) DEFAULT NULL,
  `text2` varchar(255) DEFAULT NULL,
  `text3` varchar(255) DEFAULT NULL,
  `text4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answer
-- ----------------------------

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '圈名',
  `creator_id` int(11) DEFAULT NULL COMMENT '创建圈子的用户id',
  `group_cls_id` int(11) DEFAULT NULL COMMENT '圈子的类型, 关联group_cls表',
  `create_mode` bit(1) DEFAULT NULL COMMENT '系统创建或者用户创建',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------

-- ----------------------------
-- Table structure for group_cls
-- ----------------------------
DROP TABLE IF EXISTS `group_cls`;
CREATE TABLE `group_cls` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cls` varchar(255) DEFAULT NULL COMMENT '圈子的类型名',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group_cls
-- ----------------------------

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(15000) DEFAULT NULL,
  `sponsor_id` int(11) DEFAULT NULL COMMENT '提问人id',
  `topic` varchar(100) DEFAULT NULL COMMENT '所属话题id, 最多属于5个话题',
  `reply_num` int(11) DEFAULT NULL COMMENT '回答数',
  `locked` bit(1) DEFAULT NULL COMMENT '1:锁住; 0:开放',
  `create_time` datetime DEFAULT NULL,
  `text1` varchar(255) DEFAULT NULL,
  `text2` varchar(255) DEFAULT NULL,
  `text3` varchar(255) DEFAULT NULL,
  `text4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for question_collection
-- ----------------------------
DROP TABLE IF EXISTS `question_collection`;
CREATE TABLE `question_collection` (
  `user` int(11) NOT NULL COMMENT '用户id',
  `question` int(11) NOT NULL COMMENT '收藏的问题id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user`,`question`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question_collection
-- ----------------------------

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '话题名',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级话题id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------
INSERT INTO `topic` VALUES ('1', '生活、艺术、文化与活动', '0', '2016-07-28 14:21:05');
INSERT INTO `topic` VALUES ('2', '体育', '1', '2016-07-28 14:21:46');
INSERT INTO `topic` VALUES ('3', '球类运动', '2', '2016-07-28 14:22:18');
INSERT INTO `topic` VALUES ('4', '文化', '1', '2016-07-28 14:22:44');
INSERT INTO `topic` VALUES ('5', '足球', '3', '2016-07-28 14:23:36');
INSERT INTO `topic` VALUES ('6', '足球报', '5', '2016-07-28 14:23:53');
INSERT INTO `topic` VALUES ('7', '足球游戏', '5', '2016-07-28 14:24:13');
INSERT INTO `topic` VALUES ('8', '懂球帝', '5', '2016-07-28 14:24:25');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `age` int(2) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `interest` varchar(255) DEFAULT NULL,
  `points` int(255) DEFAULT NULL COMMENT '用户积分',
  `salt` varchar(255) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_group
-- ----------------------------
DROP TABLE IF EXISTS `user_group`;
CREATE TABLE `user_group` (
  `user_id` int(11) NOT NULL COMMENT '圈子里的用户id',
  `group_id` int(11) NOT NULL COMMENT '圈子id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`,`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_group
-- ----------------------------
