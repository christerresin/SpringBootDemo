package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student miriam = new Student("Miriam", LocalDate.of(2000, Month.JANUARY, 5), "miriam@gmail.com");
      Student scott = new Student("Scott", LocalDate.of(2001, Month.JANUARY, 5), "scott@gmail.com");

      repository.saveAll(List.of(miriam, scott));
    };

  }

}
