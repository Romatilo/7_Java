package seminars.homework;

import seminars.homework.exercises.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static seminars.homework.exercises.MinMidMaxNumber.showMinMaxMid;

public class Main {
    static int[] arrayList = {4,7,1,5,89,3,2,67,43,2,55,-4,0};
        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите номер задания: ");
            System.out.println("""

                Выберите задание:\s
                1. Нахождение треугольного числа и факториала
                2. Вывод списка простых чисел до числа N
                3. Простейший калькулятор
                4. Сортировка пузырьком
                5. Распарсинг JSON-файла
                6. Сортировка слиянием
                7. Удаление четных чисел из последовательности целых чисел
                8. Нахождение минимального, максимального и среднего чисел в массиве
                9. Разворот заданного LinkedList
                10. Реализация очереди с помощью LinkedList + простейшие методы управления очередью
                """);
            int ex = scan.nextInt();

            switch (ex) {
                case 1:
                    int inputNumber = TriangleNumber.getNumber();
                    System.out.println("Треугольное число: " + TriangleNumber.getTriangleNumber(inputNumber));
                    System.out.println("Факториал числа: " + TriangleNumber.getFactorial(inputNumber));
                    break;
                case 2:
                    int inputMaxNumber = TriangleNumber.getNumber();
                    System.out.println("Узрите список простых чисел до числа N");
                    PrimeNumbers.printPrimeNumbers(inputMaxNumber);
                    break;
                case 3:
                    System.out.println(Calculator.getResult());
                    break;
                case 4:
                    int[] arrayNumbers = {3, 6, 4, 0, -5, 56, 13, 2, 17};
                    System.out.println(Arrays.toString(BubbleSort.getBubbleSort(arrayNumbers)));
                    break;
                case 5:
                    String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
                    System.out.println(ParseJson.jsonToString(json));
                    break;
                case 6:
                    System.out.println("Исходный массив:        " + Arrays.toString(arrayList));
                    System.out.println("Отсортированный массив: " + Arrays.toString(MergeSort.mergeSort(arrayList)));
                    break;
                case 7:
                    System.out.println("Исходный массив:        " + Arrays.toString(arrayList));
                    System.out.println("Удалим четные элементы: " + Arrays.toString(DeleteEven.deleteEvenNumbers(arrayList)));
                    break;
                case 8:
                    System.out.println("Исходный массив:        " + Arrays.toString(arrayList));
                    showMinMaxMid(MinMidMaxNumber.findMinMax(arrayList), arrayList);
                    break;
                case 9:
                    ReversedLinkedList.reversingLinkedList();
                    break;
                case 10:
                    ListQueue.operatingQueue();
                    break;

            }
        }
    }
