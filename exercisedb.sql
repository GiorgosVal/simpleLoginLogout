CREATE DATABASE `exercisedb` DEFAULT CHARACTER SET utf8;
USE `exercisedb`;

CREATE TABLE `exercisedb`.`users` (
`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
`username` VARCHAR(10) NOT NULL,
`pass` VARCHAR(20) NOT NULL,
`lastlogin` DATETIME,
`ip` VARCHAR(30),
PRIMARY KEY(`id`)
);

CREATE UNIQUE INDEX `usernameIndex` ON `users` (`username`);
INSERT INTO `users`(`username`, `pass`) VALUES('admin', '1234');
INSERT INTO `users`(`username`, `pass`) VALUES('val', 'val1');

CREATE TABLE `cars`(
`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
`brand` VARCHAR(20) NOT NULL,
`model` VARCHAR(20) NOT NULL,
`horsepower` INT NOT NULL,
PRIMARY KEY(`id`)
);

INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Fiat','Punto',130);
INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Toyota','Corolla',90);
INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Mercedes','Benz',150);
INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Renault','Clio',95);
INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Nissan','Sunny',100);
INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Ford','Mustang',110);
INSERT INTO `exercisedb`.`cars` (`brand`, `model`, `horsepower`) VALUES ('Honda','Civic',90);