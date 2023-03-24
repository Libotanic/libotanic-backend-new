package ru.tinkoff.academy.libotanic.garden.garden_type;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "garden_type")
@Getter
@Embeddable
public class GardenType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
}
