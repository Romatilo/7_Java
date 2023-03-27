// Реализовать простой калькулятор

package seminars.Homework;

import java.util.Scanner;
public class HW4_Calculator {

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
        double numberA = HW4_Calculator.getDoubleNumber();
        String action = HW4_Calculator.getOperator();
        System.out.print("Введите число B -> ");
        double numberB = HW4_Calculator.getDoubleNumber();
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