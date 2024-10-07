package pro.mqithelp.calc.services;

import org.springframework.stereotype.Service;

@Service
public class AriphmeticCalcImpl implements AriphmeticCalc {

    @Override
    public String plus(Integer num1, Integer num2) {
        return Integer.toString(num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        return Integer.toString(num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        return Integer.toString(num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) throw new IllegalArgumentException("Деление на ноль");
        return Double.toString((double) num1 / num2);
    }
}
