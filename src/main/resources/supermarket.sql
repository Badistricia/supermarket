/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.18 : Database - supermarket
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`supermarket` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `supermarket`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` varchar(44) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `admin` */

insert  into `admin`(`id`,`name`,`pass`) values ('1','张三','1234561'),('123','123','123'),('1444','1444','1444'),('1811050','cxy','123'),('2','李四','123'),('890','4444','333');

/*Table structure for table `date` */

DROP TABLE IF EXISTS `date`;

CREATE TABLE `date` (
  `id` varchar(43) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `outdate` varchar(45) DEFAULT NULL,
  `indate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `date` */

insert  into `date`(`id`,`name`,`outdate`,`indate`) values ('1','风','21-2-3','20-1-1'),('10','冰糕','12-2-10','15-3-27'),('11','蛋糕','12-3-4','18-4-23'),('2','卫生纸','20-2-13','21-5-7'),('3','面包','123','123'),('4','螺蛳粉','21-2-3','21-4-8'),('5','小麻花','19-1-13','21-9-10'),('7','袜子','18-7-13','20-10-9'),('8','洗面奶','16-9-13','19-2-7'),('9','牙刷','10-2-3','13-4-17');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `kind` varchar(45) DEFAULT NULL,
  `number` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `goods` */

insert  into `goods`(`id`,`name`,`kind`,`number`,`price`) values (1,'螺蛳粉','食物','1000','20'),(2,'小麻花','食物','200','10'),(3,'卫生纸','生活用品','3000','10'),(4,'蛋糕','视频','100','40'),(5,'袜子','衣服','2000','23'),(6,'面包','食物','1000','3'),(7,'风扇','生活用品','300','35'),(8,'洗面奶','生活用品','1000','20'),(9,'牙刷','生活用品','300','5'),(10,'冰糕','食物','2000','2'),(11,'丝袜','衣服','3000','10');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
