package seminars.homework.exercises;

public class PhoneData {


    /**
     * Имя
     */

    public String firstName;
    /**
     * Фамилия
     */
    public String surName;

    /**
     * Номер телефона
     */
    public String phoneNumber;

    public PhoneData(String initFirstName, String initSurName, String initPhoneNumber) {
        firstName = initFirstName;
        surName = initSurName;
        phoneNumber = initPhoneNumber;
    }

    /**
     * Метод печати
     */
    @Override
    public String toString() {
        return "Контакт: {" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + surName + '\'' +
                ", телефон='" + phoneNumber;
    }
}
