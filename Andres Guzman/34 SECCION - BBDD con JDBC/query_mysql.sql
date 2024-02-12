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

	create table categorias(
		id 				int 		not null auto_increment,
		nombre			varchar(45)	null,
		primary key(id)
	);

-- 	ALTERNANDO TABLAS EN LA BASE DE DATOS 'java_curso'
	-- AGREGANDO COLUMNA(S)
	alter table productos add column categoria_id int null after fecha_registro;

	-- AGREGANDO INDEX(ES)
	alter table productos add index idx_productos_categorias (categoria_id asc) visible;	

	-- AGREGANDO FOREIGN KEY(S)
	alter table productos add constraint fk_productos_categorias foreign key (categoria_id) references categorias (id) on delete no action on update no action;

-- 	INSERTANDO REGISTROS EN LA TABLA PRODUCTOS DE BASE DE DATOS 'java_curso'
	insert into productos(nombre, precio, fecha_registro) values('Bicicleta', 200, '2020-12-10'), ('Samsung TV', 300, '2021-05-29');

-- 	INSERTANDO REGISTROS EN LA TABLA CATEGORIAS DE BASE DE DATOS 'java_curso'
	insert into categorias(nombre) values('Deporte'), ('Tecnologia'), ('Computacion');
	
-- 	ACTUALIZANDO REGISTROS EN LA TABLA CATEGORIAS DE BASE DE DATOS 'java_curso'
	update productos set categoria_id=1 where id=1;
	update productos set categoria_id=2 where id=2;
	commit;

-- 	CONSULTANDO TABLAS DE BASE DE DATOS 'java_curso'
	select * from productos p inner join categorias c on(p.categoria_id=c.id);
