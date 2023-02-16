package ru.tinkoff.academy.libotanic.garden.unit;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import ru.tinkoff.academy.libotanic.garden.Garden;
import ru.tinkoff.academy.libotanic.garden.GardenRepository;
import ru.tinkoff.academy.libotanic.garden.GardenService;
import ru.tinkoff.academy.libotanic.garden.garden_type.GardenType;

@WebMvcTest(GardenService.class)
public class GardenServiceTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private GardenRepository gardenRepository;
  GardenType gardenType = new GardenType(1L, "Type1");
  Garden expected = Garden.builder()
      .id(5L)
      .name("Garden1")
      .gardenType(gardenType)
      .build();

  @Autowired
  private GardenService gardenService;

  @Test
  public void testSave() {
    Mockito.when(gardenService.save(expected))
            .thenReturn(expected);
  }

  @Test
  public void testGetAll() {
    Mockito.when(gardenService.findAll())
        .thenReturn(List.of(expected));
  }

  @Test
  public void testGetById() {
    Mockito.when(gardenService.findById(expected.getId()))
        .thenReturn(Optional.of(expected));
  }
}
