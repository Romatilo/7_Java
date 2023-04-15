package seminars.homework.exercises;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneData {
    public PhoneData(String initFirstName, String initLastName, String initPhoneNumber) {
        firstName = initFirstName;
        lastName = initLastName;
        mobilePhone = initPhoneNumber;
    }

    /**
     * Имя
     */
    public String firstName;
    /**
     * Фамилия
     */
    public String lastName;
    /**
     * Адрес
     */
    public String address;
    /**
     * Номер моб.телефона
     */
    public String mobilePhone;
    /**
     * Номер раб.телефона
     */
    public String workPhone;
    /**
     * Дата рождения
     */
    public Date bDate;

}