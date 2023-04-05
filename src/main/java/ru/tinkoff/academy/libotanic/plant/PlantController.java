package ru.tinkoff.academy.libotanic.plant;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractService;
import ru.tinkoff.academy.libotanic.domain.Plant;

@RestController
@RequestMapping("/plants")

public class PlantController extends AbstractController<Plant> {

  public PlantController(
      AbstractService<Plant> service) {
    super(service);
  }
}
