// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.

package seminars.homework.exercises;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, PhoneData> phoneDataBase = new HashMap<>();


    /**
     * Метод для добавления записи в телефонную книгу
     * @param pd Данные со всеми записями по данному человеку
     */
    public void addRecord(PhoneData pd){
        // Приводим ключ к нижнему регистру, пробелы убираем за ненадобностью, т.к. все данные хранятся в классе PhoneData
        phoneDataBase.putIfAbsent(pd.getFirstName().toLowerCase() + pd.lastName.toLowerCase(), pd);
        System.out.println(phoneDataBase);
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
