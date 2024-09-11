package org.example1;

import org.junit.jupiter.api.*;

class CalculateNonStaticTest {

    private CalculateNonStatic calculator;

    @AfterAll
    static void afterAll() {
        System.out.println("tests Done!");
    }

    @BeforeEach
    void beforeEach() {
        calculator = new CalculateNonStatic();
    }


    @Test
    @DisplayName("This Test add two numbers")
    void add() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = 12;

        // When
        Integer result = calculator.add(left, right);

        // Then
        Assertions.assertEquals(expected, result);

    }

    @Test
    void subrtact() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = -2;

        // When
        Integer result = calculator.subrtact(left, right);

        // Then
        Assertions.assertEquals(expected, result);

    }

    @Test
    void multiply() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = 35;

        // When
        Integer result = calculator.multiply(left, right);

        // Then
        Assertions.assertEquals(expected, result);

    }

    @Test
    void divide() {
        // Given
        int left = 10;
        int right = 2;
        Integer expected = 5;

        // When
        Integer result = calculator.divide(left, right);

        // Then
        Assertions.assertEquals(expected, result);

    }
}