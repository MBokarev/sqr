package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"TheNumberOfNumbersInSquareInRange200to300, 200, 300, 3",
            "TheNumberOfNumbersInSquareInRange500to800, 500, 800, 6",
            "TheNumberOfNumbersInSquareInRange3000to7000, 3000, 7000, 29"})
    void shouldShowCorrectNumbers(String TestName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.counterNumbers(lowerLimit, upperLimit);
        Assertions.assertEquals(expected, actual);
    }
}