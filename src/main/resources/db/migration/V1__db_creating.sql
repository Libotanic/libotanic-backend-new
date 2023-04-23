create table plant_division (
  id bigserial primary key,
  name_rus text not null,
  name_lat text not null
);

create table plant_class (
  id bigserial primary key,
  name_rus text not null,
  name_lat text not null,
  division_id bigint not null,

  foreign key(division_id) references plant_division(id)
);

create table plant_order (
  id bigserial primary key,
  name_rus text not null,
  name_lat text not null,
  class_id bigint not null,

  foreign key(class_id) references plant_class(id)
);

create table plant_family (
  id bigserial primary key,
  name_rus text not null,
  name_lat text not null,
  order_id bigint not null,

  foreign key(order_id) references plant_order(id)
);

create table garden_address (
  id bigserial primary key,
  country text not null,
  city text not null
);

create table garden_type (
  id bigserial primary key,
  name text not null,
  definition text
);

create table garden (
  id bigserial primary key,
  name text not null,
  type_id bigint not null,
  address_id bigint,

  foreign key(type_id) references garden_type(id)
);

create table plant (
  id bigserial primary key,
  name_rus text not null,
  name_lat text not null,
  description text,
  family_id bigint not null,
  garden_id bigint not null,

  foreign key(family_id) references plant_family(id)
);
