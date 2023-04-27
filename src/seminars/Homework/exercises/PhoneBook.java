package seminars.homework.exercises;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static Map<String, PhoneData> phoneDataBase = new HashMap<>();

    /**
     * Метод добавления записи в телефонную книгу.
     *
     * @param phoneData - данные абонента, добавляемые в телефонную книгу
     */
    public void addRecord(PhoneData phoneData) {
        phoneDataBase.putIfAbsent(phoneData.firstName.toLowerCase() + phoneData.surName.toLowerCase(), phoneData);
    }


    /**
     * Метод возвращает номер телефона абонента по имени и фамилии.
     *
     * @param firstName Имя
     * @param surName   Фамилия
     */
    public PhoneData getRecord(String firstName, String surName) {
        if (phoneDataBase.containsKey(firstName.toLowerCase() + surName.toLowerCase())) {
            return (phoneDataBase.get(firstName.toLowerCase() + surName.toLowerCase()));
        } else throw new RuntimeException("Такого абонента нет в телефонной книге");

    }
}
