package ru.tinkoff.academy.libotanic.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.academy.libotanic.domain.garden_type.GardenType;

@Entity
@Table(name = "garden")
@Getter
@Setter
public class Garden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

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
