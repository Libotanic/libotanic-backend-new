package ru.tinkoff.academy.libotanic.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class PlantDto {

  final Long id;
  final PlantClassificationElementDto name;
  final PlantClassificationElementDto plantFamily;
  final PlantClassificationElementDto plantOrder;
  final PlantClassificationElementDto plantClass;
  final PlantClassificationElementDto plantDivision;
  final String description;
}
