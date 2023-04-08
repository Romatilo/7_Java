//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

package seminars.homework.exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class ListQueue {

    private static LinkedList<String> ourQueue = new LinkedList<>(); // Объявим список, с которым будут работать методы
    private static int menuItem; // Переменная для выбора пункта меню пользователем

    /// Меню для пользователя
    private static int menu() {

        System.out.println("""

                Выберите действие для очереди:\s
                1. Добавить элемент в конец очереди
                2. Вывести первый элемент
                3. Вывести первый элемент и удалить его
                4. Выход""");

        Scanner scanner = new Scanner(System.in);
        menuItem = scanner.nextInt();

        return menuItem;
    }

    /// Метод управления очередью
    public static void operatingQueue() {
        while (menuItem != 4) {
            menuItem = menu();
            if (menuItem == 1) enQueue();
            if (menuItem == 2) System.out.println("Первый элемент: " + first());
            if (menuItem == 3) System.out.println("Первый элемент: " + deQueue());
            System.out.println("Текущая очередь: " + ourQueue);
        }
    }

    /// Метод добавления элемента в очередь
    private static void enQueue() {
        System.out.println("Введите элемент для добавления в очередь -> ");
        Scanner scanner = new Scanner(System.in);
        String newItem = scanner.next();

        ourQueue.addLast(newItem);
    }

    /// Метод возвращения первого элемента и его последующего удаления
    private static String deQueue() {
        String firstItem = ourQueue.getFirst();
        ourQueue.removeFirst();

        return firstItem;
    }

    /// Метод возвращения первого элемента без его удаления
    private static String first() {

        return ourQueue.getFirst();
    }

}
