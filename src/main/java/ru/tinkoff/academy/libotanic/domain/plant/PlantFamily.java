package ru.tinkoff.academy.libotanic.domain.plant;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plant_family")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class PlantFamily extends PlantClassificationElement {

  @ManyToOne
  @JoinColumn(name = "order_id")
  PlantOrder plantOrder;

  /*@OneToMany(mappedBy = "classification")
  @JsonIgnore
  private Set<Plant> plants;*/
}
