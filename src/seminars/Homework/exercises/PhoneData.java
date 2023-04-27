package seminars.homework.exercises;

public class PhoneData {

    /**
     * Имя
     */
    public static String firstName;
    /**
     * Фамилия
     */
    public static String surName;
    /**
     * Номер телефона
     */
    public static String phoneNumber;

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
        return String.format("%s %s %d", PhoneData.firstName, PhoneData.surName, PhoneData.phoneNumber);

    }
}
