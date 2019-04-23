-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: sellphone
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'HTC'),(2,'Iphone'),(3,'NOKIA'),(4,'SONY'),(5,'Blackberry'),(6,'SamSung');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listimage`
--

DROP TABLE IF EXISTS `listimage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `listimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `image` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listimage`
--

LOCK TABLES `listimage` WRITE;
/*!40000 ALTER TABLE `listimage` DISABLE KEYS */;
INSERT INTO `listimage` VALUES (1,2,'http://www.truesmart.com.vn/img/p/iphone-4-p3267.png'),(2,2,'http://www.truesmart.com.vn/img/p/iphone-4-p3267.png'),(3,2,'http://www.truesmart.com.vn/img/p/iphone-4-p3267.png'),(4,2,'http://www.truesmart.com.vn/img/p/iphone-4-p3267.png');
/*!40000 ALTER TABLE `listimage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `numberProduct` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` double DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `discount` double DEFAULT '0',
  `number_of_product` int(11) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `image` varchar(200) COLLATE utf8_unicode_ci DEFAULT 'default.jpg',
  `ram` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `memory` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chip` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `camera` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`numberProduct`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Iphone 4',2000001,'No',0,200,1,'https://static.digitecgalaxus.ch/Files/7/5/1/1/2/9/8/iPhoneSE_SpGry_PureAngles_ROW_WW-EN-SCREEN.jpg?fit=inside%7C1116:811&output-format=progressive-jpeg',NULL,NULL,NULL,NULL),(2,'Iphone 4',2000002,'No',0,200,2,'https://static.digitecgalaxus.ch/Files/7/5/1/1/2/9/8/iPhoneSE_SpGry_PureAngles_ROW_WW-EN-SCREEN.jpg?fit=inside%7C1116:811&output-format=progressive-jpeg',NULL,NULL,NULL,NULL),(3,'Iphone 4',1999090,'No',0,200,2,'https://static.digitecgalaxus.ch/Files/7/5/1/1/2/9/8/iPhoneSE_SpGry_PureAngles_ROW_WW-EN-SCREEN.jpg?fit=inside%7C1116:811&output-format=progressive-jpeg',NULL,NULL,NULL,NULL),(4,'Iphone 4',2000020,'No',0,200,2,'https://static.digitecgalaxus.ch/Files/7/5/1/1/2/9/8/iPhoneSE_SpGry_PureAngles_ROW_WW-EN-SCREEN.jpg?fit=inside%7C1116:811&output-format=progressive-jpeg',NULL,NULL,NULL,NULL),(5,'HTC one m8',1000000,'No description',10000,200,1,'https://p.ipricegroup.com/uploaded_b63dfe683698a9e7fa2dbfca238f2448.jpg',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-23  9:20:39
