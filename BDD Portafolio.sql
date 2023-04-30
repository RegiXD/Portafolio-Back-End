-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         8.0.32 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para PortafolioBDD
CREATE DATABASE IF NOT EXISTS `PortafolioBDD` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `PortafolioBDD`;

-- Volcando estructura para tabla PortafolioBDD.colaboración
CREATE TABLE IF NOT EXISTS `colaboración` (
  `Id-Usuario` int NOT NULL,
  `Id-Proyecto` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.estudio
CREATE TABLE IF NOT EXISTS `estudio` (
  `Id-Estudio` int NOT NULL AUTO_INCREMENT,
  `Instituto` varchar(50) NOT NULL,
  `Curso` varchar(50) NOT NULL,
  PRIMARY KEY (`Id-Estudio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.experiencia
CREATE TABLE IF NOT EXISTS `experiencia` (
  `Id-Experiencia` int NOT NULL AUTO_INCREMENT,
  `Empresa` varchar(50) NOT NULL,
  `Cargo` varchar(50) NOT NULL,
  `Descripción` text NOT NULL,
  PRIMARY KEY (`Id-Experiencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.fecha inicio y duración de la experiencia
CREATE TABLE IF NOT EXISTS `fecha inicio y duración de la experiencia` (
  `Id-Usuario` int NOT NULL,
  `Fecha-Inicio` date DEFAULT NULL,
  `Duración` varchar(50) DEFAULT NULL,
  `Id-Experiencia` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.habilidad
CREATE TABLE IF NOT EXISTS `habilidad` (
  `Id-Habilidad` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`Id-Habilidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.nivel de habilidad
CREATE TABLE IF NOT EXISTS `nivel de habilidad` (
  `Id-Usuario` int NOT NULL,
  `Nivel` int NOT NULL,
  `Id-Habilidad` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.proyecto
CREATE TABLE IF NOT EXISTS `proyecto` (
  `Id-Proyecto` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Descripción` text NOT NULL,
  `Link` varchar(200) NOT NULL DEFAULT '#',
  PRIMARY KEY (`Id-Proyecto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.red social
CREATE TABLE IF NOT EXISTS `red social` (
  `Id-RedSocial` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) NOT NULL,
  `Logo` varchar(50) NOT NULL,
  `Color` varchar(50) NOT NULL DEFAULT '6A615F',
  PRIMARY KEY (`Id-RedSocial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.red social de usuario
CREATE TABLE IF NOT EXISTS `red social de usuario` (
  `Id-Usuario` int NOT NULL,
  `Id-RedSocial` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` bigint NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `apellido` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `foto` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `usuario` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'usuario',
  `telefono` bigint DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `clave` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '1234',
  `profecion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `biografia` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.usuario_seq
CREATE TABLE IF NOT EXISTS `usuario_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla PortafolioBDD.último año de estudio
CREATE TABLE IF NOT EXISTS `último año de estudio` (
  `Id-Usuario` int NOT NULL,
  `fecha` date DEFAULT NULL,
  `Descripción` text NOT NULL,
  `Id-Estudio` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
