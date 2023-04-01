package seminars.homework.exercises.logging;

import java.io.IOException;
import java.util.logging.*;

public class Logging {
    public static void makeLog(int[] args) throws IOException {
            Logger logger = Logger.getLogger(Logging.class.getName());
            logger.setLevel(Level.INFO);
            FileHandler fh = new FileHandler ("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter ();
            fh.setFormatter(sFormat);
    }
}

