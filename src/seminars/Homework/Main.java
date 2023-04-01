package seminars.homework;

import seminars.homework.exercises.BubbleSort;
import seminars.homework.exercises.Calculator;
import seminars.homework.exercises.PrimeNumbers;
import seminars.homework.exercises.TriangleNumber;
import seminars.homework.exercises.logging.Logging;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

//        // Задачи 1 и 2 (нахождение треугольного числа и факториала):
//        System.out.println("Задачи на вычисление треугольного числа и факториала");
//        int inputNumber = TriangleNumber.getNumber();
//        System.out.println("Треугольное число: " + TriangleNumber.getTriangleNumber(inputNumber));
//        System.out.println("Факториал числа: " + TriangleNumber.getFactorial(inputNumber));
//
//        // Задача 3 (Вывод списка простых чисел до числа N)
//        System.out.println("\nЗадача на вывод простых чисел до числа N");
//        int inputMaxNumber = TriangleNumber.getNumber();
//        System.out.println("Узрите список простых чисел до числа N");
//        PrimeNumbers.printPrimeNumbers(inputMaxNumber);
//
//        // Задача 4 (Простейший калькулятор)
//        System.out.println("\nЗадача на реализацию простейшего калькулятора");
//        System.out.println(Calculator.getResult());

        // Задача 5. Сортировка пузырьком
        int [] arrayNumbers = {3, 6, 4, 0, -5, 56, 13, 2, 17};
        System.out.println(Arrays.toString(BubbleSort.getBubbleSort(arrayNumbers)));

        // Задача 6 Распарсинг JSON-файла
//        System.out.println(JsonToFormattedString.jsonToString());
    }
}