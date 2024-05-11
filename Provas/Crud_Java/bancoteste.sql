create database bancoteste;
use bancoteste;

create table usuario (
id_usuário int auto_increment primary key not null,
ItName varchar(45) not null, 
ItSenha varchar(45) not null
);

/*create table Cadastro (
id_usuário int auto_increment primary key not null,
ItName varchar(45) not null, 
ItSenha varchar(45) not null
);*/

insert into usuario (ItName, ItSenha) values ('admin', '1234');
insert into usuario (ItName, ItSenha) values ('g8sele', '1103');

select*from usuario;