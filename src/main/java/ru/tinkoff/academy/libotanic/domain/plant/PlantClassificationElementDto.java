package ru.tinkoff.academy.libotanic.domain.plant;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class PlantClassificationElementDto {

  final String nameRus;
  final String nameLat;

}
