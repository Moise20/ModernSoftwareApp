package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorServiceTest {

  @Test
  public void add_ShouldReturnCorrectSum() {
    // Arrange : Créer une instance du service
    CalculatorService service = new CalculatorService();

    // Act : Appeler la méthode add avec des valeurs
    int result = service.add(5, 3);

    // Assert : Vérifier que le résultat est correct
    assertEquals(8, result, "5 + 3 doit être égal à 8");
  }
}
