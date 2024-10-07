package pro.mqithelp.calc.services;

import org.springframework.stereotype.Service;

@Service
public class AriphmeticCalcImpl implements AriphmeticCalc {

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) throw new IllegalArgumentException("Деление на ноль");
        return (double) num1 / num2;
    }
}
