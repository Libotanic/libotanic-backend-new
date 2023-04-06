package ru.tinkoff.academy.libotanic.plant;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractService;
import ru.tinkoff.academy.libotanic.domain.plant.Plant;
import ru.tinkoff.academy.libotanic.domain.plant.PlantDto;
import ru.tinkoff.academy.libotanic.domain.plant.PlantMapper;

@RestController
@RequestMapping("/plants")
@RequiredArgsConstructor
public class PlantController {
  protected final AbstractService<Plant> service;
  protected final PlantMapper plantMapper;

  @GetMapping("/{id}")
  public ResponseEntity<PlantDto> findById(@PathVariable Long id) {
    Optional<Plant> optionalEntity = service.findById(id);
    return optionalEntity.map(value -> new ResponseEntity<>(plantMapper.toDto(value), HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
  }
}
