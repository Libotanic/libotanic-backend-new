package ru.tinkoff.academy.libotanic.abstract_management;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
public class AbstractController<T> {

  protected final AbstractService<T> service;

  @PostMapping
  public T save(T entity) {
    return service.save(entity);
  }

  @GetMapping
  public List<T> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<T> findById(@PathVariable Long id) {
    Optional<T> optionalEntity = service.findById(id);
    return optionalEntity.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    service.deleteById(id);
  }
}
