package ru.tinkoff.academy.libotanic.garden;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tinkoff.academy.libotanic.domain.garden.Garden;

@Repository
public interface GardenRepository extends JpaRepository<Garden, Long> {

}
