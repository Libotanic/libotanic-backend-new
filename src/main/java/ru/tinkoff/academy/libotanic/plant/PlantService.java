package ru.tinkoff.academy.libotanic.plant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractService;
import ru.tinkoff.academy.libotanic.domain.plant.Plant;

@Service
public class PlantService extends AbstractService<Plant> {

  public PlantService(JpaRepository<Plant, Long> repository) {
    super(repository);
  }
}
