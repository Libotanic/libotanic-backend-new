package ru.tinkoff.academy.libotanic.garden.integration;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.tinkoff.academy.libotanic.garden.Garden;
import ru.tinkoff.academy.libotanic.garden.garden_type.GardenType;
import ru.tinkoff.academy.libotanic.spring_integration.AbstractIntegrationTest;

@AutoConfigureMockMvc
public class GardenControllerTest extends AbstractIntegrationTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testGettingBook() throws Exception {
        Garden expectedGarden = Garden.builder()
            .id(1L)
            .gardenType(new GardenType(3L, "Ботанический сад"))
            .name("Ботанический сад Петра Великого")
            .build();

        MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get("/gardens/1"))
                .andExpect(status().isOk())
                .andReturn();

        Garden actualGarden = new ObjectMapper().readValue(result.getResponse().getContentAsString(), Garden.class);

        Assertions.assertEquals(expectedGarden, actualGarden);
  }
}
