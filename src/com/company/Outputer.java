package com.company;
import java.util.List;

public class Outputer {

    public String getStrResult(float result, DigitNotation digitNotation) {
        if (digitNotation == DigitNotation.ARABIC) { // если пользователь вводил арабские цифры
           return String.valueOf(result); // возвращаем ответ арабскими цифрами
        }
        else {
            return this.arabicToRoman((int) result); // иначе конвертируем в римские и возвращаем римскими
        }
    }

    private static String arabicToRoman(int number) { // Конвертер из арабских в римксие (хз, как работает, взял из инета)
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

}
