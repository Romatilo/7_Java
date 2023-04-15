package seminars.homework;


import seminars.homework.exercises.PhoneBook;
import seminars.homework.exercises.PhoneData;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("1. Простейшая телефонная книга: ");

                PhoneBook phoneDataBook = new PhoneBook();
                // Добавляем запись в справочник
                phoneDataBook.addRecord(new PhoneData("Иван", "Петров", "8-987-654-32-10"));
                // Печать записи из телефонной книги
                System.out.println("\n" + phoneDataBook.phoneDataBase);
                // Отображение номера телефона по найденному абоненту:
                System.out.println(phoneDataBook.getRecord("Иван", "Петров").phoneNumber);

        }
    }
