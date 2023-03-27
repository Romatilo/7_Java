//Вывести все простые числа от 1 до 1000 простое число - то число которое делится
//без остатка только на 1 и на само себя (1 - это не простое число);

package seminars.task;

public class HW3_Printing_prime_numbers {

    /// Метод проверки числа на простоту
    public static boolean IsPrime(int checkNumber)
    {
        for (int i = 2; i < checkNumber; i++)
        {
            if (checkNumber % i == 0)
                return false;
        }
        return true;
    }
    /// Метод вывода в терминал простых числе в промежутке 2..N
    public static void printPrimeNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            if (IsPrime(i)) System.out.println(i);
        }
    }

}