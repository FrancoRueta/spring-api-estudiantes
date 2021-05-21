package com.franco.huenei.estudiantes.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, APRIL,1)
            );
            Student alejo = new Student(
                    "Alejo",
                    "alejo@gmail.com",
                    LocalDate.of(2007, APRIL,1)
            );
            repository.saveAll(List.of(maria,alejo));
        };
    }
}
