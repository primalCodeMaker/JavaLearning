package org.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateTest {

    @Test
    void add() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = 12;

        // When
        Integer result = Calculate.add(left, right);

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
        Integer result = Calculate.subrtact(left, right);

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
        Integer result = Calculate.multiply(left, right);

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
        Integer result = Calculate.divide(left, right);

        // Then
        Assertions.assertEquals(expected, result);

    }

}