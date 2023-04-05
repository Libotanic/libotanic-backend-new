package ru.tinkoff.academy.libotanic.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plant")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Inheritance
public class Plant extends PlantClassificationElement {

  @Column(name = "description")
  private String description;

  @ManyToOne
  @JoinColumn(name = "garden_id", referencedColumnName = "id")
  @JsonIgnoreProperties(value = "plants")
  private Garden garden;

  @ManyToOne
  @JoinColumn(name = "family_id", referencedColumnName = "id")
  private PlantFamily family;
}