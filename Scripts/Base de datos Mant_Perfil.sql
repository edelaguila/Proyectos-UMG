CREATE SCHEMA IF NOT EXISTS `umg` DEFAULT CHARACTER SET utf8 ;
USE `umg` ;
CREATE TABLE IF NOT EXISTS `umg`.`tbl_perfil_encabezado1` (
  `PK_id_perfil` INT NOT NULL,
  `nombre_perfil` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_perfil` VARCHAR(200) NULL DEFAULT NULL,
  `estado_perfil` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_perfil`))
ENGINE = InnoDB CHARACTER SET = latin1

SELECT * FROM tbl_perfil_encabezado1;