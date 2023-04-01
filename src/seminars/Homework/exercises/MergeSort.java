/// Сортировка слиянием (через рекурсию)

package seminars.homework.exercises;

import java.util.Arrays;

public class MergeSort {
    /// Метод деления массива на половинки (через метод слияния возвращает отсортированный массив,
    // из деленных через рекурсию до чисел элементов исходного массива, Аа-ааа-ааа-аа!!! долго составлял эту фразу ))))
    public static int[] mergeSort (int[] array) {
        if (array.length <= 1) return array;  // условие выхода из рекурсии - массив поделен до одного элемента
        int[] left = Arrays.copyOfRange(array, 0,array.length/2);  // делим массив пополам
        int[] right = Arrays.copyOfRange(array,left.length, array.length);
        return mergeArrays(mergeSort(left), mergeSort(right));

        }
    /// Метод слияния массивов с сортировкой
        private static int[] mergeArrays(int[] left, int[] right) {
            int[] resultArray = new int[left.length+right.length]; // создаем результирующий массив, длина его = сумме длин половинок
            int resultArrayIn = 0; int leftIn = 0; int rightIn = 0; // счетчики для проходов по элементам массива

            while (leftIn < left.length && rightIn < right.length){  // сначала объединяем их с сортировкой, пока не дойдем до конца одной из половинок
                if (left[leftIn] < right[rightIn])
                    resultArray[resultArrayIn++] = left[leftIn++];
                else resultArray[resultArrayIn++] = right[rightIn++];
            }
            while (resultArrayIn < resultArray.length){  // потом добавляем в результирующий массив остатки второго массива
                if (leftIn != left.length)
                    resultArray[resultArrayIn++] = left[leftIn++];
                else resultArray[resultArrayIn++] = right[rightIn++];
            }
            return resultArray;
    }
}
