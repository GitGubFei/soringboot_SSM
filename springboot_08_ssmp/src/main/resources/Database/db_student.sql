/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MariaDB
 Source Server Version : 100418
 Source Host           : localhost:3306
 Source Schema         : db_student

 Target Server Type    : MariaDB
 Target Server Version : 100418
 File Encoding         : 65001

 Date: 28/06/2021 19:11:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student`  (
  `stu_id` int(8) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stu_gender` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stu_age` int(1) NOT NULL,
  `stu_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES (1, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (2, '张四', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (3, '张五', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (4, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (5, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (6, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (7, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (8, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (9, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (10, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (11, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (12, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (13, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (14, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (15, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (16, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (17, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (18, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (19, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (20, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (21, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (22, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (23, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (24, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (25, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (26, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (27, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (28, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (29, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (30, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (31, '张三', '男', 18, '15036810833');
INSERT INTO `tb_student` VALUES (32, '张三', '男', 18, '15036810833');

SET FOREIGN_KEY_CHECKS = 1;
