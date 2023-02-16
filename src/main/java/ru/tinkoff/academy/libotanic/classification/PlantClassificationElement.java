package ru.tinkoff.academy.libotanic.classification;

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
  private String nameRus;

  @Column(name = "name_lat")
  private String nameLat;
}
