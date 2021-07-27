CREATE SCHEMA `empresa`;
use empresa;
CREATE TABLE `empresa`.`trabajadores`(
	`id` int not null AUTO_INCREMENT,
    `nombre` VARCHAR(45) not null,
    `apellido` VARCHAR(45) not null,
    `telefono` VARCHAR(10) not null,
    `email` VARCHAR(45) not null,
    PRIMARY KEY(`id`));
INSERT INTO `empresa`.`trabajadores` (`nombre`, `apellido`, `telefono`, `email`) 
VALUES ('Juan', 'Perez', '3103154892', 'juanp@correo.com');
INSERT INTO `empresa`.`trabajadores` (`nombre`, `apellido`, `telefono`, `email`) 
VALUES ('Karina', 'Lozano', '3258743215', 'karinal@correo.com');
INSERT INTO `empresa`.`trabajadores` (`nombre`, `apellido`, `telefono`, `email`) 
VALUES ('Lu', 'Barraga', '3146584356', 'luba@correo.com');
select * from `empresa`.`trabajadores`;