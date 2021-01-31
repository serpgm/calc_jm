package com.company;

public class Main {

    public static void main(String[] args) throws BadFormatException {

		while (true) {

			Inputer inputer = new Inputer();

			Calculator calculator = new Calculator();
			Outputer outputer = new Outputer();

			String result = outputer.getStrResult(
					calculator.calculate(
							inputer.firstNumber.digit,
							inputer.secondNumber.digit,
							inputer.sign,
							inputer.firstNumber.digitType
					), inputer.firstNumber.digitType
			); // ↑ Этот код альтернативная (сокращенная) запись кода ниже ↓
//		float cleanResult = calculator.calculate(
//			inputer.firstNumber.digit,
//			inputer.secondNumber.digit,
//			inputer.sign,
//			inputer.firstNumber.digitType
//		);
//		String result = outputer.getStrResult(cleanResult, inputer.firstNumber.digitType);

			System.out.println(result); // выводим результат
		}
	}
}