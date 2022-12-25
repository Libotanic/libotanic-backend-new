package ru.tinkoff.academy.libotanic.garden;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractService;

@RestController
@RequestMapping("/gardens")
public class GardenController extends AbstractController<Garden> {

  public GardenController(
      AbstractService<Garden> service) {
    super(service);
  }
}
