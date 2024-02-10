-- 	CREA UNA BASE DE DATOS EN MYSQL
   	create database java_curso;
   
-- 	ELIMINA UNA BASE DE DATOS EN MYSQL
	drop database java_curso;

-- 	CONSULTA LAS BASES DE DATOS EN MYSQL
	show databases;
	o
	select schema_name from information_schema.schemata;

-- 	CONSULTA LAS TABLAS QUE EXISTEN EN MYSQL
	select * from information_schema.tables;

-- 	BASE DE DATOS QUE SE VA A USAR EN MYSQL
	use java_curso;

-- 	ELIMINA TABLAS EN LA BASE DE DATOS 'java_curso'
	drop table productos;

-- 	CREANDO TABLAS EN LA BASE DE DATOS 'java_curso'
	create table productos(
		id 				int 		not null auto_increment,
		nombre			varchar(45)	null,
		precio			int			null,
		fecha_registro 	datetime	null,
		primary key(id)
	);

-- 	INSERTANDO LOS PRIMERO REGISTROS EN LA TABLA PRODUCTOS DE BASE DE DATOS 'java_curso'
	insert into productos(nombre, precio, fecha_registro) values('Bicicleta', 200, '2020-12-10'), ('Samsung TV', 300, '2021-05-29');
