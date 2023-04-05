package ru.tinkoff.academy.libotanic.domain.plant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlantClassificationElement {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "name_rus")
  String nameRus;

  @Column(name = "name_lat")
  String nameLat;
}
