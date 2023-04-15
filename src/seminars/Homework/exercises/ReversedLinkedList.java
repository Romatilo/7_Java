//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package seminars.homework.exercises;

import java.util.Collections;
import java.util.LinkedList;

public class ReversedLinkedList {
    public static void reversingLinkedList() {

        LinkedList<String> givenList = new LinkedList<>();

        givenList.add("вдали");
        givenList.add("несся");
        givenList.add("херувим");
        givenList.add("баговым");
        givenList.add("метеором");

        System.out.println("Список до переворота: " + givenList);
        Collections.reverse(givenList);
        System.out.println("Список после переворота: " + givenList);
    }
}