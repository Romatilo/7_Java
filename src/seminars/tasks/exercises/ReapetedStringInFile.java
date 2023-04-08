//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package seminars.tasks.exercises;

import java.io.FileWriter;
import java.io.IOException;

public class ReapetedStringInFile {

    public static void write(String argument) {
        try (FileWriter inFile = new FileWriter("test.txt")) {
            inFile.append(String.valueOf(argument).repeat(5));
            System.out.println("Recorded ...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
