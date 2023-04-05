package ru.tinkoff.academy.libotanic.domain.plant;

import org.springframework.stereotype.Component;

@Component
public class PlantMapper {

  public PlantDto toDto(Plant plant) {
    return PlantDto.builder()
        .id(plant.getId())
        .name(new PlantClassificationElementDto(plant.nameRus, plant.nameLat))
        .plantFamily(
            new PlantClassificationElementDto(plant.getFamily().nameRus, plant.getFamily().nameLat))
        .plantOrder(new PlantClassificationElementDto(
            plant.getFamily().getPlantOrder().nameRus,
            plant.getFamily().getPlantOrder().nameLat
        ))
        .plantClass(new PlantClassificationElementDto(
            plant.getFamily().getPlantOrder().plantClass.nameRus,
            plant.getFamily().getPlantOrder().plantClass.nameLat
        ))
        .plantDivision(new PlantClassificationElementDto(
            plant.getFamily().getPlantOrder().plantClass.plantDivision.nameRus,
            plant.getFamily().getPlantOrder().plantClass.plantDivision.nameLat
        ))
        .description(plant.getDescription())
        .plantImages(plant.getImages().stream().map(it -> it.url).toList())
        .build();
  }
}
