package seminars.task;

import seminars.task.Task3_Counting_1_in_a_row_in_in_array;

public class Main {
    public static void main(String[] args) {
//        Task1_Hello_recent_time task1 = new Task1_Hello_recent_time();
        Task1_Hello_recent_time.hello();
//        Task2_Good_time_of_the_day.hello();
        int[] array = new int[] {1,1,1,1,1,0,0,1,1,1,1};
        System.out.println(Task3_Counting_1_in_a_row_in_in_array.getMaxOneCount(array));
    }
}
