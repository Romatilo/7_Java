package seminars.tasks.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class SortedListOfRandomNumbers {
        public static void createSortedList (String[] args){
            Random random = new Random();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(1, 11));
            }
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
        }
}
