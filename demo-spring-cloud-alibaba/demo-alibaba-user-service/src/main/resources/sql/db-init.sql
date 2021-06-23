CREATE TABLE `t_user` (
                          `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                          `username` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '用户名/员工工号',
                          `pwd` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '密码',
                          `secret` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '盐',
                          `real_name` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '真实姓名',
                          `phone` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '手机号码',
                          `tel` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '固定电话',
                          `email` varchar(32) COLLATE utf8mb4_bin NOT NULL COMMENT '邮箱',
                          `is_enabled` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '启用状态0:禁用  1:启用',
                          `is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '删除状态0:未删除 1:已删除',
                          `remark` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
                          `create_time` datetime NOT NULL COMMENT '创建时间',
                          `update_time` datetime NOT NULL COMMENT '更新时间',
                          PRIMARY KEY (`id`) USING BTREE,
                          UNIQUE KEY `uk_username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户表';


INSERT INTO `demo_spring_cloud_user`.`t_user`(`username`, `pwd`, `secret`, `real_name`, `phone`, `tel`, `email`, `is_enabled`, `is_deleted`, `remark`, `create_time`, `update_time`) VALUES ('zhangsan', '123456', '123456', 'lisi', '13454565567', '54230590', 'demo@qq.com', 1, 0, NULL, '2021-06-23 18:53:09', '2021-06-23 18:53:09');