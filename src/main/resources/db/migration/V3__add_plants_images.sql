create table plant_image (
  plant_id bigint not null,
  image_url text not null,
  foreign key(plant_id) references plant(id)
);