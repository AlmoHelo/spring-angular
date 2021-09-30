CREATE DATABASE  IF NOT EXISTS `cabinet_medical` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cabinet_medical`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cabinet_medical
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adresse`
--

DROP TABLE IF EXISTS `adresse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adresse` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero` varchar(45) NOT NULL,
  `rue` varchar(45) NOT NULL,
  `cp` int NOT NULL,
  `ville` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adresse`
--

LOCK TABLES `adresse` WRITE;
/*!40000 ALTER TABLE `adresse` DISABLE KEYS */;
/*!40000 ALTER TABLE `adresse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deplacement`
--

DROP TABLE IF EXISTS `deplacement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deplacement` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patient_id` int NOT NULL,
  `date` datetime NOT NULL,
  `cout` double NOT NULL,
  `infirmiere_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_deplacement_patient1_idx` (`patient_id`),
  KEY `fk_deplacement_infirmiere1_idx` (`infirmiere_id`),
  CONSTRAINT `fk_deplacement_infirmiere1` FOREIGN KEY (`infirmiere_id`) REFERENCES `infirmiere` (`id`),
  CONSTRAINT `fk_deplacement_patient1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deplacement`
--

LOCK TABLES `deplacement` WRITE;
/*!40000 ALTER TABLE `deplacement` DISABLE KEYS */;
/*!40000 ALTER TABLE `deplacement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infirmiere`
--

DROP TABLE IF EXISTS `infirmiere`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `infirmiere` (
  `id` int NOT NULL AUTO_INCREMENT,
  `adresse_id` int NOT NULL,
  `numeroProfessionnel` int NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `telPro` int NOT NULL,
  `telPerso` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `telPro_UNIQUE` (`telPro`),
  UNIQUE KEY `numeroProfessionnel_UNIQUE` (`numeroProfessionnel`),
  UNIQUE KEY `telPerso_UNIQUE` (`telPerso`),
  KEY `fk_infirmiere_adresse1_idx` (`adresse_id`),
  CONSTRAINT `fk_infirmiere_adresse1` FOREIGN KEY (`adresse_id`) REFERENCES `adresse` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infirmiere`
--

LOCK TABLES `infirmiere` WRITE;
/*!40000 ALTER TABLE `infirmiere` DISABLE KEYS */;
/*!40000 ALTER TABLE `infirmiere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `adresse_id` int DEFAULT NULL,
  `infirmiere_id` int DEFAULT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `dateDeNaissance` date NOT NULL,
  `sexe` enum('Homme','Femme','Autre') NOT NULL,
  `numeroSecuriteSocial` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numeroSecuriteSocial_UNIQUE` (`numeroSecuriteSocial`),
  KEY `fk_patient_adresse_idx` (`adresse_id`),
  KEY `fk_patient_infirmiere1_idx` (`infirmiere_id`),
  CONSTRAINT `fk_patient_adresse` FOREIGN KEY (`adresse_id`) REFERENCES `adresse` (`id`) ON DELETE SET NULL,
  CONSTRAINT `fk_patient_infirmiere1` FOREIGN KEY (`infirmiere_id`) REFERENCES `infirmiere` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-30 14:00:15
