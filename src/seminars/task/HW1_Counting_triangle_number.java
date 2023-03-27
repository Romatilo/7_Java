//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//        n! (произведение чисел от 1 до n)

package seminars.task;

import java.util.Scanner;

public class HW1_Counting_triangle_number {
    /// Метод ввода числа с клавиатуры
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    /// Метод нахождения треугольного числа
    public static int getTriangleNumber(int number){
        int triangleNumber = (number + 1) * number / 2;
        return triangleNumber;
    }
    /// Метод нахождения факториала числа
    public static int getFactorial(int number){
        int factorial = 1;
        for (int i = 1; i < number+1; ++i) {
            factorial = factorial*i;
            }
        return factorial;
    }
}








