package ru.tinkoff.academy.libotanic.domain.plant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.tinkoff.academy.libotanic.domain.garden.Garden;

@Entity
@Table(name = "plant")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Inheritance
public class Plant extends PlantClassificationElement {
  //TODO add plant place info, make partition into static and nonstatic info
  @Column(name = "description")
  private String description;

  @ManyToOne
  @JoinColumn(name = "garden_id", referencedColumnName = "id")
  @JsonIgnoreProperties(value = "plants")
  private Garden garden;

  @ManyToOne
  @JoinColumn(name = "family_id", referencedColumnName = "id")
  private PlantFamily family;

  @OneToMany
  @JoinColumn(name = "plant_id", referencedColumnName = "id")
  private List<PlantImage> images;
}