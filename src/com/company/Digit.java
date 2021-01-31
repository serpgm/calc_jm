package com.company;
import java.util.HashMap;

public class Digit {
    int digit;
    DigitNotation digitType;

    Digit(String strDigit) throws BadFormatException {
        HashMap<String, Integer> RomeDigits = new HashMap<String, Integer>();
        RomeDigits.put("i", 1);
        RomeDigits.put("ii", 2);
        RomeDigits.put("iii", 3);
        RomeDigits.put("iv", 4);
        RomeDigits.put("v", 5);
        RomeDigits.put("vi", 6);
        RomeDigits.put("vii", 7);
        RomeDigits.put("viii", 8);
        RomeDigits.put("ix", 9);
        RomeDigits.put("x", 10);

        try {
            this.digit = Integer.parseInt(strDigit);
            this.digitType = DigitNotation.ARABIC;
        } catch (NumberFormatException e) {
            this.digit = (int) RomeDigits.get(strDigit);
            this.digitType = DigitNotation.ROME;
        }

        if (this.digit > 10) {
            throw new BadFormatException();
        }
    }
}
