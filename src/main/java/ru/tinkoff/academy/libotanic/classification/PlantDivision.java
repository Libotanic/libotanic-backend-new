package ru.tinkoff.academy.libotanic.classification;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "plant_division")
@Inheritance(strategy = InheritanceType.JOINED)
public class PlantDivision extends PlantClassificationElement {

}
