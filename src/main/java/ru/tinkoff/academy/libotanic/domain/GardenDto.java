package ru.tinkoff.academy.libotanic.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GardenDto {
  final Long id;
  final String name;
  final String gardenType;
}
