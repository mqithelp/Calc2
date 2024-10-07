package pro.mqithelp.calc.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AriphmeticCalcImplTest {
    Integer num0;
    Integer num1;
    Integer num2;

    @BeforeEach
    void setUp() {
        num0 = 0;
        num1 = 5;
        num2 = 2;
    }

    @Test
    void plus() {
        AriphmeticCalcImpl ariphmeticCalc = new AriphmeticCalcImpl();
        Assertions.assertEquals(ariphmeticCalc.plus(num1, num2), num1 + num2);
    }

    @Test
    void minus() {
        AriphmeticCalcImpl ariphmeticCalc = new AriphmeticCalcImpl();
        Assertions.assertEquals(ariphmeticCalc.minus(num1, num2), num1 - num2);
    }

    @Test
    void multiply() {
        AriphmeticCalcImpl ariphmeticCalc = new AriphmeticCalcImpl();
        Assertions.assertEquals(ariphmeticCalc.multiply(num1, num2), num1 * num2);
    }

    @Test
    void divide() {
        AriphmeticCalcImpl ariphmeticCalc = new AriphmeticCalcImpl();
        Assertions.assertEquals(ariphmeticCalc.divide(num1, num2), (double) num1 / num2);
    }

    @Test
    void divideByZero() {
        AriphmeticCalcImpl ariphmeticCalc = new AriphmeticCalcImpl();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ariphmeticCalc.divide(num1, num0);
        });
    }
}
