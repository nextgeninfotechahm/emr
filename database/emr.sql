-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: emr
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `allergies`
--

DROP TABLE IF EXISTS `allergies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `allergies` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `ICDCode` varchar(50) DEFAULT NULL,
  `snowmedRef` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allergies`
--

LOCK TABLES `allergies` WRITE;
/*!40000 ALTER TABLE `allergies` DISABLE KEYS */;
/*!40000 ALTER TABLE `allergies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ethnicities`
--

DROP TABLE IF EXISTS `ethnicities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ethnicities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ethnicities`
--

LOCK TABLES `ethnicities` WRITE;
/*!40000 ALTER TABLE `ethnicities` DISABLE KEYS */;
/*!40000 ALTER TABLE `ethnicities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facility`
--

DROP TABLE IF EXISTS `facility`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facility` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` char(2) DEFAULT NULL,
  `zipCode` varchar(10) DEFAULT NULL,
  `logoRef` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facility`
--

LOCK TABLES `facility` WRITE;
/*!40000 ALTER TABLE `facility` DISABLE KEYS */;
/*!40000 ALTER TABLE `facility` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genders`
--

DROP TABLE IF EXISTS `genders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genders`
--

LOCK TABLES `genders` WRITE;
/*!40000 ALTER TABLE `genders` DISABLE KEYS */;
/*!40000 ALTER TABLE `genders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `healthconditions`
--

DROP TABLE IF EXISTS `healthconditions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `healthconditions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `ICDCode` varchar(50) DEFAULT NULL,
  `snowmedRef` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `healthconditions`
--

LOCK TABLES `healthconditions` WRITE;
/*!40000 ALTER TABLE `healthconditions` DISABLE KEYS */;
/*!40000 ALTER TABLE `healthconditions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idtypes`
--

DROP TABLE IF EXISTS `idtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `idtypes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `folderPath` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idtypes`
--

LOCK TABLES `idtypes` WRITE;
/*!40000 ALTER TABLE `idtypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `idtypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `licensedstaff`
--

DROP TABLE IF EXISTS `licensedstaff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `licensedstaff` (
  `id` int NOT NULL AUTO_INCREMENT,
  `staffId` int DEFAULT NULL,
  `licenseId` varchar(50) DEFAULT NULL,
  `licenseState` char(2) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `inclusions` varchar(500) DEFAULT NULL,
  `exclusions` varchar(500) DEFAULT NULL,
  `canPrescribe` tinyint(1) DEFAULT NULL,
  `canDiagnose` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `staffId` (`staffId`),
  CONSTRAINT `licensedstaff_ibfk_1` FOREIGN KEY (`staffId`) REFERENCES `staff` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `licensedstaff`
--

LOCK TABLES `licensedstaff` WRITE;
/*!40000 ALTER TABLE `licensedstaff` DISABLE KEYS */;
/*!40000 ALTER TABLE `licensedstaff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lastname` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `middleinitial` char(1) DEFAULT NULL,
  `street` varchar(100) NOT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` char(2) DEFAULT NULL,
  `zipcode` varchar(10) DEFAULT NULL,
  `dob` date NOT NULL,
  `genderId` int NOT NULL,
  `ethnicityId` int NOT NULL,
  `raceId` int NOT NULL,
  `primaryPhone` varchar(12) DEFAULT NULL,
  `secondaryPhone` varchar(12) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `contactName` varchar(100) DEFAULT NULL,
  `contactPhone` varchar(12) DEFAULT NULL,
  `contactEmail` varchar(256) DEFAULT NULL,
  `contactAddress` varchar(1000) DEFAULT NULL,
  `smsConsent` tinyint(1) DEFAULT NULL,
  `emailConsent` tinyint(1) DEFAULT NULL,
  `idType` int DEFAULT NULL,
  `idValue` varchar(256) DEFAULT NULL,
  `idDocRef` varchar(256) DEFAULT NULL,
  `statusId` int DEFAULT NULL,
  `other` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientallergies`
--

DROP TABLE IF EXISTS `patientallergies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientallergies` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patientId` int DEFAULT NULL,
  `allergyId` int DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `verified` tinyint(1) DEFAULT NULL,
  `verifiedby` int DEFAULT NULL,
  `verifiedDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `patientallergies_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientallergies`
--

LOCK TABLES `patientallergies` WRITE;
/*!40000 ALTER TABLE `patientallergies` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientallergies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientdocs`
--

DROP TABLE IF EXISTS `patientdocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientdocs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patientId` int DEFAULT NULL,
  `docType` varchar(100) DEFAULT NULL,
  `docPath` varchar(256) DEFAULT NULL,
  `comments` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `patientdocs_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientdocs`
--

LOCK TABLES `patientdocs` WRITE;
/*!40000 ALTER TABLE `patientdocs` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientdocs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patienthealthcondition`
--

DROP TABLE IF EXISTS `patienthealthcondition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patienthealthcondition` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patientId` int DEFAULT NULL,
  `conditionId` int DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `verified` tinyint(1) DEFAULT NULL,
  `verifiedby` int DEFAULT NULL,
  `verifiedDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `patienthealthcondition_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patienthealthcondition`
--

LOCK TABLES `patienthealthcondition` WRITE;
/*!40000 ALTER TABLE `patienthealthcondition` DISABLE KEYS */;
/*!40000 ALTER TABLE `patienthealthcondition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientinsurance`
--

DROP TABLE IF EXISTS `patientinsurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientinsurance` (
  `id` int NOT NULL AUTO_INCREMENT,
  `primaryInsurceProvider` varchar(256) DEFAULT NULL,
  `primaryPolicyTypeId` int DEFAULT NULL,
  `groupCode` varchar(30) DEFAULT NULL,
  `primaryPolicyName` varchar(30) DEFAULT NULL,
  `subscriberId` varchar(30) DEFAULT NULL,
  `subscriberName` varchar(200) DEFAULT NULL,
  `subscriberDob` date DEFAULT NULL,
  `primaryInsurancePhone` varchar(12) DEFAULT NULL,
  `hasSecondary` tinyint(1) DEFAULT NULL,
  `secInsurceProvider` varchar(256) DEFAULT NULL,
  `secPolicyTypeId` int DEFAULT NULL,
  `secGroupCode` varchar(30) DEFAULT NULL,
  `secSubscriberId` varchar(30) DEFAULT NULL,
  `secSubscriberName` varchar(200) DEFAULT NULL,
  `secSubscriberDob` date DEFAULT NULL,
  `secInsurancePhone` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientinsurance`
--

LOCK TABLES `patientinsurance` WRITE;
/*!40000 ALTER TABLE `patientinsurance` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientinsurance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientnotes`
--

DROP TABLE IF EXISTS `patientnotes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientnotes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patientId` int DEFAULT NULL,
  `note` varchar(256) DEFAULT NULL,
  `modifiedDate` date DEFAULT NULL,
  `addedBy` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `patientnotes_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientnotes`
--

LOCK TABLES `patientnotes` WRITE;
/*!40000 ALTER TABLE `patientnotes` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientnotes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissions`
--

DROP TABLE IF EXISTS `permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permissions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissions`
--

LOCK TABLES `permissions` WRITE;
/*!40000 ALTER TABLE `permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `races`
--

DROP TABLE IF EXISTS `races`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `races` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `races`
--

LOCK TABLES `races` WRITE;
/*!40000 ALTER TABLE `races` DISABLE KEYS */;
/*!40000 ALTER TABLE `races` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rolepermissions`
--

DROP TABLE IF EXISTS `rolepermissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rolepermissions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `roleId` int DEFAULT NULL,
  `permissionId` int DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roleId` (`roleId`),
  KEY `permissionId` (`permissionId`),
  CONSTRAINT `rolepermissions_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `roles` (`id`),
  CONSTRAINT `rolepermissions_ibfk_2` FOREIGN KEY (`permissionId`) REFERENCES `permissions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rolepermissions`
--

LOCK TABLES `rolepermissions` WRITE;
/*!40000 ALTER TABLE `rolepermissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `rolepermissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `id` int NOT NULL AUTO_INCREMENT,
  `staffId` varchar(20) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `jobId` int DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `userid` varchar(10) DEFAULT NULL,
  `licensed` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statusids`
--

DROP TABLE IF EXISTS `statusids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statusids` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statusids`
--

LOCK TABLES `statusids` WRITE;
/*!40000 ALTER TABLE `statusids` DISABLE KEYS */;
/*!40000 ALTER TABLE `statusids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userId` varchar(20) DEFAULT NULL,
  `password` varchar(256) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `lastLogin` date DEFAULT NULL,
  `staffId` int DEFAULT NULL,
  `patientId` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `staffId` (`staffId`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`staffId`) REFERENCES `staff` (`id`),
  CONSTRAINT `users_ibfk_2` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-13 11:22:03
