package org.example1;

import org.junit.jupiter.api.*;

class CalculateStaticTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll annotation");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll annotation");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("   Before each test code ");
    }

    @AfterEach
    void afterEach() {
        System.out.println("   After each test code ");
    }

    @Test
    @DisplayName("This Test add two numbers")
    void add() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = 12;

        // When
        Integer result = CalculateStatic.add(left, right);

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
        Integer result = CalculateStatic.subrtact(left, right);

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
        Integer result = CalculateStatic.multiply(left, right);

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
        Integer result = CalculateStatic.divide(left, right);

        // Then
        Assertions.assertEquals(expected, result);

    }

}