package ru.tinkoff.academy.libotanic.domain.plant;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import java.util.List;
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

  final List<String> plantImages;
}
