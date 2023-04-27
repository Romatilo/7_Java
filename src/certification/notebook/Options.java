package certification.notebook;


import java.util.LinkedList;
import java.util.Random;

public class Options {

    //    Create random Notebooks database
    public static LinkedList dataBase() {
        LinkedList<Notebook> notebookDataBase = new LinkedList<>();
        int notebooksAmount = 10;
        for (int i = 0; i < notebooksAmount; i++) {
            notebookDataBase.add(new Notebook(BrandPick.getRandomBrand(), getRandomModel(), getRandomRam(),
                    + getRandomHdd(), ColorPick.getRandomColor(), OpSysPick.getRandomOpSys(), getRandomPrice()));
        }

        return notebookDataBase;
    }

    enum BrandPick {
        Acer, Apple, ASUS, Dell, HP, Lenovo, Samsung, Sony, Xiaomi;

        /**
         * Pick a random value of the BrandPick enum.
         *
         * @return a random BrandPick.
         */
        public static BrandPick getRandomBrand() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    /**
     * Notebook available colors
     */
    enum ColorPick {
        Black, Blue, Burgundy, Pink, Red, Silver, White;

        /**
         * Pick a random value of the ColorPick enum.
         *
         * @return a random ColorPick.
         */
        public static ColorPick getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    /**
     * Notebook available Operational systems
     */
    enum OpSysPick {
        DOS, Linux, MacOS, Ubuntu, Windows;

        /**
         * Pick a random value of the OpSysPick enum.
         *
         * @return a random OpSysPick.
         */
        public static OpSysPick getRandomOpSys() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    /**
     * Create Notebook Model from random symbols
     */
    public static StringBuilder getRandomModel() {
        int modelNameLength = 5;
        StringBuilder randomModel = new StringBuilder(modelNameLength);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";
        for (int i = 0; i < modelNameLength; i++) {
            Random r = new Random();
            char c = alphabet.charAt(r.nextInt(alphabet.length()));
            randomModel.append(c);
        }
        return randomModel;
    }

    /**
     * Notebook random RAM memory size
     */
    public static int getRandomRam() {
        int ramSegment = 1;
        int step = 2;
        int maxSegmentRate = 8;
        Random r = new Random();
        int randomRam = ramSegment * step * r.nextInt(1, maxSegmentRate);

        return randomRam;
    }

    /**
     * Notebook random HDD memory size
     */
    public static int getRandomHdd() {
        int hddSegment = 128;
        int maxSegmentRate = 8;
        Random r = new Random();
        int randomHdd = hddSegment * r.nextInt(1, maxSegmentRate);

        return randomHdd;
    }
    /**
     * Notebook random price in a given interval
     */
    public static int getRandomPrice() {
        int minPrice = 10000;
        int maxPrice = 100000;
        Random r = new Random();
        int randomPrice = r.nextInt(minPrice, maxPrice);

        return randomPrice;
    }
}

