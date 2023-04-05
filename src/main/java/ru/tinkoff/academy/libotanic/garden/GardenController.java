package ru.tinkoff.academy.libotanic.garden;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractController;
import ru.tinkoff.academy.libotanic.abstract_management.AbstractService;
import ru.tinkoff.academy.libotanic.plant.Plant;

@RestController
@RequestMapping("/gardens")
@RequiredArgsConstructor
public class GardenController {
  protected final GardenMapper mapper;

  protected final AbstractService<Garden> service;

  @PostMapping
  public Garden save(Garden entity) {
    return service.save(entity);
  }

  @GetMapping
  @JsonIgnoreProperties(value = "plants")
  public List<Garden> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  @JsonIgnoreProperties(value = "plants")
  public ResponseEntity<GardenDto> findById(@PathVariable Long id) {
    Optional<Garden> optionalEntity = service.findById(id);
    return optionalEntity.map(value -> new ResponseEntity<>(mapper.toDto(value), HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
  }

  @GetMapping("/{id}/plants")
  @JsonIgnoreProperties(value = "plants")
  public ResponseEntity<Set<Plant>> findPlantsById(@PathVariable Long id) {
    Optional<Garden> optionalEntity = service.findById(id);
    return optionalEntity.map(value -> new ResponseEntity<>(value.plants, HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
  }


  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    service.deleteById(id);
  }

}

