-- create database banco1;
use banco1;
/*
create table cadastro(
Email varchar(255) null, 
Senha varchar (255) null
);
usuario
create table usuario(
ID int primary key auto_increment not null,
Nome varchar(255) not null, 
Nascimento date not null, 
Endereco varchar(255) not null
);
   
create table doramas(
ID int primary key auto_increment not null,
Plataforma varchar(255) not null,
Nome varchar(255) not null,
Genero varchar(255) not null, 
Temp int not null, 
Eps int not null,
Min time not null 
);
*/

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE usuario (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  `Nascimento` DATE NOT NULL,
  `Endereco` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cadastro`
-- -----------------------------------------------------
CREATE TABLE Cadastro (
  `email` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `usuario_ID` INT NOT NULL,
  INDEX `fk_Cadastro_usuario_idx` (`usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Cadastro_usuario`
    FOREIGN KEY (`usuario_ID`)
    REFERENCES `mydb`.`usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`dorama`
-- -----------------------------------------------------
CREATE TABLE dorama (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Plataforma` VARCHAR(45) NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Genero` VARCHAR(45) NOT NULL,
  `Temporada` INT NOT NULL,
  `Episodios` INT NOT NULL,
  `Mins` TIME NOT NULL,
  `usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_dorama_usuario1_idx` (`usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_dorama_usuario1`
    FOREIGN KEY (`usuario_ID`)
    REFERENCES `mydb`.`usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

