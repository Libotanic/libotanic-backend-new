package ru.tinkoff.academy.libotanic.domain;


import org.springframework.stereotype.Component;

@Component
public class GardenMapper {
  public GardenDto toDto(Garden garden) {
    return new GardenDto(
        garden.getId(),
        garden.name,
        garden.gardenType.name
    );
  }
}


