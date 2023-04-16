package seminars.homework.exercises;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook2 {

    public static Map<String, PhoneData2> phoneDataBase = new HashMap<>();

    /**
     * Метод добавления записи в телефонную книгу.
     * @param phoneData - данные абонента, добавляемые в телефонную книгу
     */
    public void addRecord (PhoneData2 phoneData){
        phoneDataBase.putIfAbsent(phoneData.firstName.toLowerCase() + phoneData.lastName.toLowerCase(), phoneData);

    }
}
