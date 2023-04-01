package seminars.homework;

import seminars.homework.exercises.DeleteEven;
import seminars.homework.exercises.MergeSort;
import seminars.homework.exercises.MinMidMaxNumber;

import java.util.Arrays;

import static seminars.homework.exercises.MinMidMaxNumber.*;

public class Main3 {
    public static void main(String[] args){
        ///Пусть будет один и тот же массив чисел arrayList для всех задач
        int[] arrayList = {4,7,1,5,89,3,2,67,43,2,55,-4,0};
        System.out.println("Исходный массив:        " + Arrays.toString(arrayList));
        /// Задача 7 Сортировка слиянием
        System.out.println("Отсортированный массив: " + Arrays.toString(MergeSort.mergeSort(arrayList)));
        /// Задача 8 Удаление четных чисел из последовательности целых чисел
        System.out.println("Удалим четные элементы: " + Arrays.toString(DeleteEven.deleteEvenNumbers(arrayList)));
        /// Задача 9 Нахождение минимального, максимального и среднего чисел в массиве
        showMinMaxMid(MinMidMaxNumber.findMinMax(arrayList), arrayList);
    }
}
