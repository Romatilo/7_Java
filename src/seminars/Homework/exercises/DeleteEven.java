//Пусть дан произвольный список целых чисел, удалить из него чётные числа.
//Вопрос, какие числа считать четными в списке. Считать с нулевого элемента или с первого?
//Буду считать с единицы - так задача чуть-чуть интереснее.

package seminars.homework.exercises;

public class DeleteEven {
    public static int[] deleteEvenNumbers(int[] array) {
        int[] newArray = new int[array.length / 2 + array.length % 2];
        //Вторая половина в выражении - чтобы не потерять последний элемент, если в списке нечетное количество элементов
        int j = 0; //индекс для нового массива
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}

