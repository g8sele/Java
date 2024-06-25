create database banco1;
use banco1;

create table usuario(
ID int primary key auto_increment not null,
nome varchar(255) not null, 
idade varchar(255) not null, 
genero varchar(255) not null,
email varchar(255) not null, 
senha varchar (255) not null
);
   
create table doramas(
ID int primary key auto_increment not null,
plataforma varchar(255) not null,  
nome varchar(255) not null,
genero varchar(255) not null, 
temp varchar(255) not null, 
eps varchar(255) not null,
observacao varchar(500) not null,
usuario_email varchar(255) not null,
INDEX fk_doramas_usuario1_idx (usuario_email ASC),
CONSTRAINT fk_doramas_usuario1
FOREIGN KEY (usuario_email)
REFERENCES usuario(email)
);

ALTER TABLE usuario ADD UNIQUE (email);
select plataforma as Plataforma, nome as Nome, genero as Gênero, temp as Temporada, eps as Episódio, observacao as Observação from doramas;
select*from usuario;
select*from doramas;

TRUNCATE TABLE doramas;