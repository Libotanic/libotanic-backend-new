package ru.tinkoff.academy.libotanic.plant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tinkoff.academy.libotanic.domain.plant.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

}
