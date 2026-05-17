package com.devops.todoapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
  "spring.datasource.url=jdbc:h2:mem:testdb",
  "spring.datasource.driver-class-name=com.h2console.Driver",
  "spring.jpa.hibernate.ddl-auto=create-drop"
})
class TodoappApplicationTests {

  @Test
  void contextLoads() {
    System.out.println("✅ Application Spring Boot démarre correctement !");
  }
}
