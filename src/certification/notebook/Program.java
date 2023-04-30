package certification.notebook;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static certification.notebook.Options.*;

public class Program {
    public static Set dataBase = getDataBase();

    ///    Create random Notebooks database using HashSet
    public static Set getDataBase() {
        Set<Notebook> notebookDataBase = new HashSet<>();
        int notebooksAmount = 50;
        for (int i = 0; i < notebooksAmount; i++) {
            notebookDataBase.add(new Notebook(Options.BrandPick.getRandomBrand(), getRandomModel(), getRandomRam(),
                    +getRandomHdd(), Options.ColorPick.getRandomColor(), Options.OpSysPick.getRandomOpSys(), getRandomPrice()));
        }
        return notebookDataBase;
    }

    public static void run() {
        Search programData = new Search();
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter criterion number: \n" +
                "1 - Notebook brand\n" +
                "2 - RAM size\n" +
                "3 - HDD size\n" +
                "4 - Notebook color\n" +
                "5 - Operating system\n" +
                "6 - Notebook price\n");
        int choise = scan.nextInt();
        switch (choise) {
            case 1:
                System.out.print("Enter notebook brand (Acer/Apple/ASUS/Dell/DNS/HP/Lenovo/MSI/Samsung/Sony/Xiaomi): ");
                scan = new Scanner(System.in);
                String brand = scan.nextLine();
                programData.searchByBrand(brand, dataBase);
                break;
            case 2:
                System.out.print("Enter minimal value of RAM size: ");
                scan = new Scanner(System.in);
                Integer minRam = scan.nextInt();
                Integer maxRAM;
                do {
                    System.out.print("Enter maximum value of RAM size: ");
                    maxRAM = scan.nextInt();
                } while (maxRAM <= minRam);
                programData.searchByRam(minRam, maxRAM, dataBase);
                break;
            case 3:
                System.out.print("Enter minimal value of HDD size: ");
                scan = new Scanner(System.in);
                Integer minHdd = scan.nextInt();
                Integer maxHdd;
                do {
                    System.out.print("Enter maximum value of HDD size: ");
                    maxHdd = scan.nextInt();
                } while (maxHdd <= minHdd);
                programData.searchByHdd(minHdd, maxHdd, dataBase);
                break;
            case 4:
                System.out.print("Enter notebook color: ");
                scan = new Scanner(System.in);
                String color = scan.nextLine();
                programData.searchByColor(color, dataBase);
                break;
            case 5:
                System.out.print("Enter operating system (DOS/Linux/MacOS/Ubuntu/Windows): ");
                scan = new Scanner(System.in);
                String os = scan.nextLine();
                programData.searchByOS(os, dataBase);
                break;
            case 6:
                System.out.print("Enter minimum price value: ");
                scan = new Scanner(System.in);
                int minPrice = scan.nextInt();
                int maxPrice;
                do {
                    System.out.print("Enter maximum price value: ");
                    maxPrice = scan.nextInt();
                } while (maxPrice <= minPrice);
                programData.searchByPrice(minPrice, maxPrice, dataBase);
                break;

        }
    }
}

