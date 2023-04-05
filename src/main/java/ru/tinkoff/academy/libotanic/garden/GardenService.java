package ru.tinkoff.academy.libotanic.garden;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractService;
import ru.tinkoff.academy.libotanic.domain.Garden;

@Service
public class GardenService extends AbstractService<Garden> {

  public GardenService(
      JpaRepository<Garden, Long> repository) {
    super(repository);
  }
}
