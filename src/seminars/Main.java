package seminars;

import seminars.Homework.HW1_Counting_triangle_number;
import seminars.Homework.HW3_Printing_prime_numbers;
import seminars.Homework.HW4_Calculator;

public class Main {
    public static void main(String[] args) {
//        Task1_Hello_recent_time task1 = new Task1_Hello_recent_time();
//        Task1_Hello_recent_time.hello();
//        Task2_Good_time_of_the_day.hello();
//        int[] array = new int[] {1,1,1,1,1,0,0,1,1,1,1};
//        System.out.println(Task3_Counting_1_in_a_row_in_array.getMaxOneCount(array));

        // Задачи 1 и 2 (нахождение треугольного числа и факториала):
        System.out.println("Задачи на вычисление треугольного числа и факториала");
        int inputNumber = HW1_Counting_triangle_number.getNumber();
        System.out.println("Треугольное число: " + HW1_Counting_triangle_number.getTriangleNumber(inputNumber));
        System.out.println("Факториал числа: " + HW1_Counting_triangle_number.getFactorial(inputNumber));

        // Задача 3 (Вывод списка простых чисел до числа N)
        System.out.println("\nЗадача на вывод простых чисел до числа N");
        int inputMaxNumber = HW1_Counting_triangle_number.getNumber();
        System.out.println("Узрите список простых чисел до числа N");
        HW3_Printing_prime_numbers.printPrimeNumbers(inputMaxNumber);

        // Задача 4 (Простейший калькулятор)
        System.out.println("\nЗадача на реализацию простейшего калькулятора");
        System.out.println(HW4_Calculator.getResult());
    }
}
