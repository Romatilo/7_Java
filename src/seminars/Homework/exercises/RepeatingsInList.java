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
        Map<String, Integer> namesList = new HashMap<>();
        for (String records : RepeatingsInList.namesList) {
            // Выбираем имя из строки и приводим его к нижнему регистру
            String firstName = records.split(" ")[0].toLowerCase();
            // Считаем, сколько раз встречается каждое имя
            if (namesList.get(firstName) == null) {
                namesList.put(firstName, 1);
            } else {
                namesList.put(firstName, namesList.get(firstName) + 1);
            }
        }

        /// Уберем из HashMap все записи со значением "1"
        while( namesList.values().remove(1) );

        /// И выведем список имен в порядке убывания повторений
        namesList.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

        }


    }
