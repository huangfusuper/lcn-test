/*
 Navicat Premium Data Transfer

 Source Server         : 101.132.168.240
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 101.132.168.240:3306
 Source Schema         : lcn-server2

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 26/09/2019 17:28:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for server2
-- ----------------------------
DROP TABLE IF EXISTS `server2`;
CREATE TABLE `server2`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
