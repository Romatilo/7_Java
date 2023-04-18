//  Пусть дан список сотрудников.
//  Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.

package seminars.homework.exercises;

import java.util.HashMap;
import java.util.Map;

public class RepeatingsInList {

    private static String[] namesList = new String[]{
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Иван Иванов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Иван Иванов",
            "Мария Рыкова",
            "Анна Крутова",
            "Марина Лугова",
            "Анна Владимирова",
            "Петр Лыков",
            "Иван Мечников",
            "Петр Петин",
            "Петр Лыков",
            "Иван Ежов"
    };

    public static void getNamesList() {
        Map<String, Integer> repeatingNamesList = new HashMap<>();
        for (String records : namesList) {
            // Выбираем имя из строки и приводим его к нижнему регистру
            String firstName = records.split(" ")[0].toLowerCase();
            // Проверяем, встречалось ли имя раньше и если да - увеличиваем значение нашего хэшмэпа на 1.
            if (repeatingNamesList.get(firstName) == null) {
                repeatingNamesList.put(firstName, 1);
            } else {
                repeatingNamesList.put(firstName, +1);
            }
            System.out.println(repeatingNamesList);


        }
    }
}