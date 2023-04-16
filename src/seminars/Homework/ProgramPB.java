package seminars.homework;


import seminars.homework.exercises.PhoneBook;
import seminars.homework.exercises.PhoneData;

public class ProgramPB {
    public static void main(String[] args) {
        showInfo();
    }

    public static void showInfo(){
        System.out.print("1. Простейшая телефонная книга: ");
        PhoneBook phoneDataBook = new PhoneBook();
        System.out.println();

        // Добавляем запись в справочник
        phoneDataBook.addRecord(new PhoneData("Иван", "Петров", "8-987-654-32-10"));
        phoneDataBook.addRecord(new PhoneData("Николай", "Каблуков", "8-123-456-78-90"));
        phoneDataBook.addRecord(new PhoneData("Динис", "Светлаков", "8-111-446-78-00"));
        // Вывод на экран телефонной книги
        System.out.println(phoneDataBook.phoneDataBase.toString());
        // Отображение номера телефона по найденному абоненту:
        System.out.println("Отображение номера телефона по найденному абоненту: ");
        String getName = "Иван";
        String getLastName = "Петров";
        System.out.println(getName+" "+getLastName+" "+phoneDataBook.getRecord(getName,getLastName).phoneNumber);


    }
}
