package ru.tinkoff.academy.libotanic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;



@SpringBootApplication
public class LibotanicBackendApplication {
  public static void main(String[] args) {
    SpringApplication.run(LibotanicBackendApplication.class, args);
  }

}
