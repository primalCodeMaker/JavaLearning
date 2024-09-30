package org.example1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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

    private String createMessage(int param) {
        System.out.println("nice, the test passed " + param);
        return "FAIL " + param;
    }


    @Test
    @DisplayName("assertEquals / assertNotEquals -> with messages")
    void add() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = 12;

        // When
        Integer result = calculator.add(left, right);

        // Then
        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected, result, "Good");
        Assertions.assertEquals(expected, result, createMessage(5));
        Assertions.assertNotEquals(expected, 2, () -> createMessage(444));

    }

    @Test
    @DisplayName("assertTrue / assertFalse & assertNull / assertNotNull")
    void subrtact() {
        // Given
        int left = 5;
        int right = 7;
        Integer expected = -2;

        // When
        Integer result = calculator.subrtact(left, right);

        // Then
        Assertions.assertNotNull(result);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);

    }

    @Test
    @DisplayName("Assertion.assertAll >> wywolywanie testow po sobie w przypadku faila")
    void multiply() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(true, () -> "test 1 "),
                () -> Assertions.assertTrue(true, () -> "test 2 "),
                () -> Assertions.assertTrue(true, () -> "test 3 ")
        );

    }

    @Test
    @DisplayName("Exception throw Test")
    void divide() {
        // Given
        String left = "10";
        String right = "XXX";

        // When, Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(left, right));
//        Assertions.assertThrows(EnumConstantNotPresentException.class, ()-> calculator.divide(left, right));  // fail!

        // przyklad z wiadomoscia podczas faila
        NumberFormatException thowable = Assertions.assertThrows(NumberFormatException.class, () -> calculator.divide(left, right));
        Assertions.assertEquals("For input String: \"" + right + "\"", thowable.getMessage());
    }

    @ParameterizedTest
    @MethodSource(value = "testData111")
    void paramAdd(int[] testData) {
        // Given, When
        int result = calculator.paramAdd(testData[1], testData[2]);

        // Then
        Assertions.assertEquals(testData[0], result);

    }
    public static int[][] testData111() {
        return new int [][]{
            {5, 2, 3},
            {8, 3, 5},
            {9, 2, 7}
        };
    }

}