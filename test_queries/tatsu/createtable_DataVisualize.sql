drop table cube cascade;
drop table torus cascade;
drop table cuboid cascade;
drop table pyramid cascade;
drop table sphere cascade;

create table cube(
	id serial,
	size int,
	primary key(id)
	);
create table torus(
	id serial,
	r1 int,
	r2 int,
	primary key(id)
	);
create table cuboid(
	id serial,
	l_size int,
	w_size int,
	d_size int,
	primary key(id)
	);
create table pyramid(
	id serial,
	size int,
	height int,
	primary key(id)
	);
create table sphere(
	id serial,
	size int,
	primary key(id)
	);