package ru.tinkoff.academy.libotanic.garden;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.academy.libotanic.garden.garden_type.GardenType;
import ru.tinkoff.academy.libotanic.plant.Plant;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "garden")
@Getter
@Setter
public class Garden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    @JsonIgnoreProperties(value = "id")
    GardenType gardenType;

    @OneToMany(mappedBy = "garden", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "garden")
    Set<Plant> plants;
}
