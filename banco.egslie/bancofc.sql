-- create database banco1;
use banco1;

create table usuario(
ID int primary key auto_increment not null,
Nome varchar(255) not null, 
Nascimento date not null, 
Endereco varchar(255) not null,
Email varchar(255) not null, 
Senha varchar (255) not null
);
   
create table doramas(
ID int primary key auto_increment not null,
Plataforma varchar(255) not null,  
Nome varchar(255) not null,
Genero varchar(255) not null, 
Temp int not null, 
Eps int not null,
Min time not null,
usuario_ID int not null,
INDEX fk_doramas_usuario1_idx (usuario_ID ASC),
CONSTRAINT fk_doramas_usuario1
FOREIGN KEY (usuario_ID)
REFERENCES usuario(ID)
);


