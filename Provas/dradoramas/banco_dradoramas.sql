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
usuario_ID int not null,
INDEX fk_doramas_usuario1_idx (usuario_ID ASC),
CONSTRAINT fk_doramas_usuario1
FOREIGN KEY (usuario_ID)
REFERENCES usuario(ID)
);



