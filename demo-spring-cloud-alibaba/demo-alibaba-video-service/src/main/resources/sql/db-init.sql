CREATE TABLE `t_video` (
                           `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                           `title` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '视频标题',
                           `summary` varchar(256) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '描述',
                           `cover_img` varchar(256) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '视频图片',
                           `price` int(11) DEFAULT NULL COMMENT '视频价格',
                           `point` decimal(4,2) DEFAULT NULL COMMENT '评分',
                           `remark` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
                           `create_time` datetime NOT NULL COMMENT '创建时间',
                           `update_time` datetime NOT NULL COMMENT '更新时间',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


INSERT INTO `demo_spring_cloud_video`.`t_video`(`id`, `title`, `summary`, `cover_img`, `price`, `point`, `remark`, `create_time`, `update_time`) VALUES (1, 'rocketmq课程', '高上大的课程', '1.jpg', 100, 9.10, NULL, '2021-06-24 12:44:10', '2021-06-24 12:44:10');