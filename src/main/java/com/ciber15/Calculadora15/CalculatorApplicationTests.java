package com.ciber15.calculator15;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorApplicationTests {
    private Calculadora calculator = new Calculadora();

    @Test
    void contextLoads() {
    }

    @Test
    public void testSum() {
    assertEquals(5, calculator.sum(2, 3));
    }
}