package seminars.tasks;

import seminars.tasks.exercises.RecentTime;
import seminars.tasks.exercises.CountingInRowArray;

public class Main {
    public static void main(String[] args) {
        // Задание 1 - Поприветствовать пользователя и указать текущее время
        RecentTime task1 = new RecentTime();
        RecentTime.hello();
        // Задание 2 - Поприветсвоввать пользователя, указав время дня
        // GoodTimeOfTheDay.hello();
        // Задание 3 - Посчитать максимальное количество "1", идущих подряд в массиве
        int[] array = new int[] {1,1,1,1,1,0,0,1,1,1,1};
        System.out.println(CountingInRowArray.getMaxOneCount(array));
    }
}
