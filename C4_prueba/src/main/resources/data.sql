drop database if exists prueba; 
create database prueba;
use prueba;

create table usuarios(
id int auto_increment,
nombre VARCHAR(20),
password VARCHAR(20),
pais VARCHAR(15),
primary key (id)
);

create table videojuegos(
id int auto_increment,
nombre VARCHAR(20),
primary key (id)
);

create table grupos(
id int auto_increment,
nombre VARCHAR(20),
id_videojuego int,
id_usuario int,
primary key (id),
foreign key (id_videojuego) REFERENCES videojuegos (id)
ON UPDATE CASCADE ON DELETE CASCADE,
foreign key (id_usuario) REFERENCES usuarios (id)
ON UPDATE CASCADE ON DELETE CASCADE
);

create table mensajes(
id int auto_increment,
nombre VARCHAR(20),
id_usuario int,
primary key (id),
foreign key (id_usuario) REFERENCES usuarios (id)
ON UPDATE CASCADE ON DELETE CASCADE
);
