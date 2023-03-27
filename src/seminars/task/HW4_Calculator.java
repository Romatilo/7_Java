// Реализовать простой калькулятор

package seminars.task;

import java.util.Scanner;
public class HW4_Calculator {

    /// Метод ввода числа
    public static double getDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        return inputNumber;
    }

    /// Метод ввода знака оператора
    public static String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию (+ - * \\) -> ");
        String operator = scanner.next();
        return operator;
    }

    /// Метод вычисления операции
    public static double getResult() {
        System.out.print("Введите число A -> ");
        double numberA = HW4_Calculator.getDoubleNumber();
        String action = HW4_Calculator.getOperator();
        System.out.println(action);
        System.out.print("Введите число B -> ");
        double numberB = HW4_Calculator.getDoubleNumber();
        if (action == "+") return (numberA + numberB);
        else if (action == "-") return (numberA - numberB);
        else if (action == "*") return (numberA * numberB);
        else return (numberA / numberB);
    }
}
