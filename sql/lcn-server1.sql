/*
 Navicat Premium Data Transfer

 Source Server         : 101.132.168.240
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 101.132.168.240:3306
 Source Schema         : lcn-server1

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 26/09/2019 17:28:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for server1
-- ----------------------------
DROP TABLE IF EXISTS `server1`;
CREATE TABLE `server1`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
