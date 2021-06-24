CREATE TABLE `t_order` (
                           `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                           `out_trade_no` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '订单唯一标识',
                           `state` int(11) DEFAULT NULL COMMENT '0表示未支付，1表示已支付',
                           `total_fee` int(11) DEFAULT NULL COMMENT '支付金额，单位分',
                           `video_id` bigint(20) DEFAULT NULL COMMENT '视频主键',
                           `video_title` varchar(256) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '视频标题',
                           `video_img` varchar(256) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '视频图片',
                           `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
                           `remark` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
                           `create_time` datetime NOT NULL COMMENT '创建时间',
                           `update_time` datetime NOT NULL COMMENT '更新时间',
                           PRIMARY KEY (`id`) USING BTREE,
                           UNIQUE KEY `uk_out_trade_no` (`out_trade_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';


INSERT INTO `demo_spring_cloud_order`.`t_order`(`id`, `out_trade_no`, `state`, `total_fee`, `video_id`, `video_title`, `video_img`, `user_id`, `remark`, `create_time`, `update_time`) VALUES (1, '8ABA67E76A6F4C9FB69C42CD0F442C24', 100, NULL, 1, 'rocketmq课程', '1.jpg', 1, NULL, '2021-06-24 12:48:18', '2021-06-24 12:48:18');