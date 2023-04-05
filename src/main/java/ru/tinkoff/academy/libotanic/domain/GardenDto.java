package ru.tinkoff.academy.libotanic.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class GardenDto {
  final Long id;
  final String name;
  final String gardenType;
}
