package com.company;

import java.util.Scanner;

public class Inputer { // Класс для получения и обработки данных
    Digit firstNumber;
    Digit secondNumber;
    String sign;

    Inputer() throws BadFormatException {
        System.out.println("Please enter expression:"); // Просим ввести выражение

        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();

        expression = expression.replaceAll("\\s{2,}", " ") // Заменяем двойные, тройные и т.д. пробелы на одинарные
                               .replaceAll("^\\s*", ""); // Удаляем пробелы в начале строки, если они есть

        String[] splitted_expression = expression.split("\s"); // Разбиваем получившуюся строку (например, "1 + 2")
                                                                     // на элементы и записываем в массив (например ["1", "+", "2"]
                                                                     // т.е. всегда первая позиция в массиве - первая цифра, вторая - знак и третья - вторая цифра

        this.firstNumber = new Digit(splitted_expression[0].toLowerCase()); // приводим к нижнему регистру и инициализируем объект Digit
        // структура объекта Digit
        // Digit.digit -- сама цифра
        // Digit.digitType -- тип цифры
        this.secondNumber = new Digit(splitted_expression[2].toLowerCase());

        String signs = "+-*/"; // строка с математическими символами
        if (signs.contains(splitted_expression[1])) { // проверяем, есть ли символ, который ввел пользователь в строке с математическими символами
            this.sign = splitted_expression[1]; // если да, то сохраняем символ
        }
        else {
            throw new BadFormatException(); // если нет, завершаем программу с исключением
        }

        if (this.firstNumber.digitType != this.secondNumber.digitType) { // Проверяем, что и первое, и второе число в одной и той же системе счисления
            throw new BadFormatException(); // Если нет, завершаем программу с исключением
        }
    }
}