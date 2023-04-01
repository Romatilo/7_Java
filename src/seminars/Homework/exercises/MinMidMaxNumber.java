package seminars.homework.exercises;

public class MinMidMaxNumber {
    ///Метод нахождения минимального и максимального числа в массиве
    public static int[] findMinMax(int[] array) {
        int[] minMax = {array[0], array[0]};
        for (int i = 1; i < array.length; i++) {
            if (array[i] > minMax[1]) minMax[1] = array[i];
            if (array[i] < minMax[0]) minMax[0] = array[i];
        }
        return minMax;
    }

    ///Метод отображения минимального, максимального и среднего чисел в массиве
    public static void showMinMaxMid(int[] minMax, int[] array) {
        int half =  (minMax[0]+minMax[1])/2;  //Сначала найдем среднее значение между минимальным и максимальным элементами
        int midNumber = minMax[0]; //Присвоим для начала среднему числу из массива значение минимального числа
        //Можно было присвоить ему также первое число из исходного массива, разницы нет совсем.
        int difference = Math.abs(minMax[0] - half); //Переменная difference будет хранить разницу (по модулю) между
                                                     // текущим средним элементом и срединным значением.
        ///Цикл для нахождения среднего числа в исходном массиве
        for (int i = 1; i < array.length ; i++) {
            if (Math.abs(array[i]-half) < difference){
                midNumber = array[i];
                difference = Math.abs(array[i]-half);
            }
        }
        System.out.println("Минимальное число:  " + minMax[0] +
                           "\nСреднее число:      " + midNumber +
                           "\nМаксимальное число: " + minMax[1]);
    }
}
