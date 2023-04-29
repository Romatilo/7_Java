package certification.notebook;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Options {

    //    Create random Notebooks database using HashSet
    public static Set dataBase() {
        Set<Notebook> notebookDataBase = new HashSet<>();
        int notebooksAmount = 50;
        for (int i = 0; i < notebooksAmount; i++) {
            notebookDataBase.add(new Notebook(BrandPick.getRandomBrand(), getRandomModel(), getRandomRam(),
                    +getRandomHdd(), ColorPick.getRandomColor(), OpSysPick.getRandomOpSys(), getRandomPrice()));
        }
        return notebookDataBase;
    }

    /**
     * Notebook available brands
     */
    enum BrandPick {
        Acer, Apple, ASUS, Dell, DNS, HP, Lenovo, MSI, Samsung, Sony, Xiaomi;

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
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
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

    /**
     * Search by brand of manufacturer
     * @param brand
     */
    public void searchByBrand(String brand) {
        for (Object notebookItem : Options.dataBase()) {
            if (notebookItem.toString().toLowerCase().contains(brand.toLowerCase()))
                System.out.println(notebookItem.toString());
        }
    }
    public Boolean searchByRam (Integer minRam, Integer maxRam) {


        for (Object notebookItem : Options.dataBase()) {
            return notebookItem.get(ram) >= minRam && randomRam <= maxRam;
        }
    }

    /**
     * Search by notebook color (OS)
     * @param color
     */
    public void searchByColor(String color) {
        for (Object notebookItem : Options.dataBase()) {
            if (notebookItem.toString().toLowerCase().contains(color.toLowerCase()))
                System.out.println(notebookItem.toString());
        }
    }

    /**
     * Search by Operating system (OS)
     * @param os
     */
    public void searchByOS(String os) {
        for (Object notebookItem : Options.dataBase()) {
            if (notebookItem.toString().toLowerCase().contains(os.toLowerCase()))
                System.out.println(notebookItem.toString());
        }
    }
}

