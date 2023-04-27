// Реализовать простой калькулятор

package seminars.homework.exercises;

import java.util.Scanner;

public class Calculator {

    /// Метод ввода числа double
    public static double getDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        return inputNumber;
    }

    /// Метод ввода знака операции
    public static String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию ( + - * / ) -> ");
        String operator = scanner.next();
        return operator;
    }

    /// Метод вычисления операции
    public static double getResult() {
        System.out.print("Введите число A -> ");
        double numberA = Calculator.getDoubleNumber();
        String action = Calculator.getOperator();
        System.out.print("Введите число B -> ");
        double numberB = Calculator.getDoubleNumber();
        double result = -1;

        switch (action) {
            case "+" -> result = numberA + numberB;
            case "-" -> result = numberA - numberB;
            case "*" -> result = numberA * numberB;
            case "/" -> result = numberA / numberB;
            default -> System.out.println("Something went wrong!");
        }

        return result;
    }
}