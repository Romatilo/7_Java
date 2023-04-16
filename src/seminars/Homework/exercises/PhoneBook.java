// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.

package seminars.homework.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    public static Map<String, PhoneData> phoneDataBase = new HashMap<>();


    /**
     * Метод для добавления записи в телефонную книгу
     * @param pd Данные с записями по данному человеку
     */
    public void addRecord(PhoneData pd){
        // Приводим ключ к нижнему регистру
        phoneDataBase.putIfAbsent(pd.getFirstName().toLowerCase() + pd.lastName.toLowerCase(), pd);
        System.out.println(phoneDataBase);
    }

    /**
     * Метод печати телефонной книги
     */
    public static <phoneDataBase> void printPhoneBook(phoneDataBase pd) {
        // Print keys
        for (String i : phoneDataBase.keySet()) System.out.println(i);
    }


    /**
     * Метод возвращает данные человека по Фамилии и Имени
     * @param firstName Имя
     * @param lastName Фамилия
     * @return
     */
    public PhoneData getRecord(String firstName, String lastName){
        if (phoneDataBase.containsKey(firstName.toLowerCase() + lastName.toLowerCase()))
            return phoneDataBase.get(firstName.toLowerCase() + lastName.toLowerCase());
        else
            throw new RuntimeException("Нет такого абонента!");
    }
}
