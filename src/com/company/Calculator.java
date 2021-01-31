package com.company;

public class Calculator { // Калькулятор

    public float calculate(int a, int b, String sign, DigitNotation digitsType){ //аргументы: первое число, второе число, знак и тип чисел
        switch (sign) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                if (digitsType == DigitNotation.ARABIC) { // если арабские числа, то возвращаем точный результат, например 5 / 3 = 1.6666666...
                    return ((float) a / b);
                }
                else {
                    return a / b; // если римское, то возвращаем только целую часть, например 5 / 3 = 1
                }
            case "*":
                return a * b;
        }
        return 0; // (КОСТЫЛЬ) На случай, если знака не будет в switch-case
                   // По идее в этом случае должно выпадать исключение
    }
}
