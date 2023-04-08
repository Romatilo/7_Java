package seminars.tasks;

import seminars.tasks.exercises.ReapetedList;
import seminars.tasks.exercises.ReapetedStringInFile;
import seminars.tasks.exercises.RecentTime;
import seminars.tasks.exercises.StringCompression;

public class Main2 {
    public static void main(String[] args) {
        // Задание 1 - Вывести строку повторяющихся символов с1С2
        System.out.println(ReapetedList.getRepeatString(8));
        // Задание 2 - Сжать строку по повторяющимся символам и написать их количество
        String inputString = "aaaabbbcdd";
        System.out.println(StringCompression.getStringCompression(inputString));
        // Задание 3 - Записать в файл строку N раз, обработав исключения
        ReapetedStringInFile test = new ReapetedStringInFile();
        ReapetedStringInFile.write("test");
    }
}
