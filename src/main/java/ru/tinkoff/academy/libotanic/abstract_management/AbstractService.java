package ru.tinkoff.academy.libotanic.abstract_management;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@RequiredArgsConstructor
public abstract class AbstractService<T> {

  private final JpaRepository<T, Long> repository;

  public T save(T entity) {
    return repository.save(entity);
  }

  public List<T> findAll() {
    return repository.findAll();
  }

  public Optional<T> findById(Long id) {
    return repository.findById(id);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }

}
