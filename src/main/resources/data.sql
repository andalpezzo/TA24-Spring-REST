DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario int
);

insert into empleado (nombre, trabajo, salario) values ('Andrea Dal Pezzo', 'Informatico', 20);
insert into empleado (nombre, trabajo, salario) values ('Yolanda Martínez', 'Comercial', 30);
insert into empleado (nombre, trabajo, salario) values ('Jose Pérez', 'Teleoperador', 40);