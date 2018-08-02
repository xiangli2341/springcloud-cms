/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.5-10.3.8-MariaDB : Database - db_springcloud-cms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_springcloud-cms` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `db_springcloud-cms`;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '订单id',
  `payment` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '实付金额',
  `payment_type` int(11) DEFAULT NULL COMMENT '支付类型',
  `postage` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '邮费',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '订单更新时间',
  `payment_time` datetime DEFAULT NULL COMMENT '付款时间',
  `consign_time` datetime DEFAULT NULL COMMENT '发货时间',
  `end_time` datetime DEFAULT NULL COMMENT '交易完成时间',
  `close_time` datetime DEFAULT NULL COMMENT '交易关闭时间',
  `shipping_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '物流名称',
  `shipping_code` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '物流单号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户留言',
  `buyer_message` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '买家留言',
  `buyer_nickname` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '买家昵称',
  `buyer_rate` int(11) DEFAULT NULL COMMENT '买家是否已经评价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_order` */

insert  into `t_order`(`id`,`payment`,`payment_type`,`postage`,`status`,`create_time`,`update_time`,`payment_time`,`consign_time`,`end_time`,`close_time`,`shipping_name`,`shipping_code`,`user_id`,`buyer_message`,`buyer_nickname`,`buyer_rate`) values ('158994090990145072','24.80',1,'8.00',2,'2018-05-09 23:33:36',NULL,'2018-05-09 23:33:40','2018-05-10 09:39:30','2018-05-20 09:39:39',NULL,'圆通速递','889470367264232554',2,NULL,'小泽同志',2),('164656698407145072','96.00',1,'0',2,'2018-05-21 13:12:45',NULL,'2018-05-21 13:12:50','2018-05-21 13:17:07','2018-05-31 13:17:14',NULL,'韵达快递','3832372360113',1,'圆通或者韵达快递发货哦！','蜡笔小新',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
