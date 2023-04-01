package seminars.homework;

import seminars.homework.exercises.*;

public class Main {
    public static void main(String[] args) {

        // Задачи 1 и 2 (нахождение треугольного числа и факториала):
        System.out.println("Задачи на вычисление треугольного числа и факториала");
        int inputNumber = TriangleNumber.getNumber();
        System.out.println("Треугольное число: " + TriangleNumber.getTriangleNumber(inputNumber));
        System.out.println("Факториал числа: " + TriangleNumber.getFactorial(inputNumber));

        // Задача 3 (Вывод списка простых чисел до числа N)
        System.out.println("\nЗадача на вывод простых чисел до числа N");
        int inputMaxNumber = TriangleNumber.getNumber();
        System.out.println("Узрите список простых чисел до числа N");
        PrimeNumbers.printPrimeNumbers(inputMaxNumber);

        // Задача 4 (Простейший калькулятор)
        System.out.println("\nЗадача на реализацию простейшего калькулятора");
        System.out.println(Calculator.getResult());
    }
}