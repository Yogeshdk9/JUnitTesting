CREATE DATABASE cafecoffee;

DROP TABLE IF EXISTS `customers`;

 CREATE TABLE`customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(65) NOT NULL,
  PRIMARY KEY (`id`)
) ;

LOCK TABLES `customers` WRITE;

UNLOCK TABLES;

DROP TABLE IF EXISTS `coffee`;

 CREATE TABLE`coffee` (
  `product_code` int(11) NOT NULL AUTO_INCREMENT,
  `coffee_name` varchar(45) NOT NULL,
  `category` varchar(45) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_code`)
);

LOCK TABLES `coffee` WRITE;

INSERT INTO `coffee` VALUES (1,'Latte','coffee',180,NULL),(2,'Capuccino','coffee',165,NULL),(3,'Espresso','coffee',200,NULL),(4,'Flat White','coffee',145,NULL),(5,'Long Black','coffee',150,NULL),(6,'Irish Coffee','coffee',195,NULL),(7,'Caffe Mocha','coffee',220,NULL);

UNLOCK TABLES;

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `order_total` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk1_idx` (`customer_id`),
  CONSTRAINT `fk1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

LOCK TABLES `orders` WRITE;

UNLOCK TABLES;