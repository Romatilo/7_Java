// Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

package seminars.task;

import java.util.Scanner;

public class HW1_Counting_triangle_number {
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(number);
        return(number);
    }
    static int getTriangleNumber(){
        int number = getNumber();
        int triangleNumber = (number + 1) * number / 2;
        return triangleNumber;
    }
    static int getFactorial(){
        int number = getNumber();
        System.out.println(number);
        int factorial = 1;
        for (int i = 1; i == number; i++) {
            factorial = factorial*i;
            System.out.println(factorial);
            }
        return factorial;
    }
}








