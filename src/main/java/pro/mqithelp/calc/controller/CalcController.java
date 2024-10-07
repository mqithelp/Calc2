package pro.mqithelp.calc.controller;

import org.springframework.web.bind.annotation.*;
import pro.mqithelp.calc.services.AriphmeticCalc;

@RestController
@RequestMapping(path = "/calculator")
public class CalcController {
    private final AriphmeticCalc ariphmeticCalc;

    public CalcController(AriphmeticCalc ariphmeticCalc) {
        this.ariphmeticCalc = ariphmeticCalc;
    }

    @GetMapping(path = "")
    public String home() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return ariphmeticCalc.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return ariphmeticCalc.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return ariphmeticCalc.multiply(num1, num2);
    }
    @GetMapping(path = "divide")
    String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return ariphmeticCalc.divide(num1, num2);
    }
}