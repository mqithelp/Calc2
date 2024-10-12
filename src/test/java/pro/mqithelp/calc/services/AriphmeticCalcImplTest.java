package pro.mqithelp.calc.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AriphmeticCalcImplTest {
    Integer num0;
    Integer num1;
    Integer num2;
    AriphmeticCalc ariphmeticCalc;
    private int num;

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(4, 9),
                Arguments.of(5, 45),
                Arguments.of(7, 8));
    }

    @BeforeEach
    void setUp() {
        ariphmeticCalc = new AriphmeticCalcImpl();
        num0 = 0;
        num1 = 5;
        num2 = 2;
    }

    @Test
    void plus() {
        Assertions.assertEquals(ariphmeticCalc.plus(num1, num2), num1 + num2);
    }

    @Test
    void minus() {
        Assertions.assertEquals(ariphmeticCalc.minus(num1, num2), num1 - num2);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(ariphmeticCalc.multiply(num1, num2), num1 * num2);
    }

    @Test
    void divide() {
        Assertions.assertEquals(ariphmeticCalc.divide(num1, num2), (double) num1 / num2);
    }

    @Test
    void divideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ariphmeticCalc.divide(num1, num0);
        });
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void plusParamTest(int num1, int num2) {
        Assertions.assertEquals(ariphmeticCalc.plus(num1, num2), num1 + num2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void minusParamTest(int num1, int num2) {
        Assertions.assertEquals(ariphmeticCalc.minus(num1, num2), num1 - num2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void multiplyParamTest(int num1, int num2) {
        Assertions.assertEquals(ariphmeticCalc.multiply(num1, num2), num1 * num2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void divideParamTest(int num1, int num2) {
        Assertions.assertEquals(ariphmeticCalc.divide(num1, num2), (double) num1 / num2);
    }
}
