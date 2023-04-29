package certification;

import certification.notebook.Options;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Options.dataBase());
        Options testData = new Options();
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
                testData.searchByBrand(brand);
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
                testData.searchByRAM(minRam, maxRAM);
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
                testData.searchByHdd(minHdd, maxHdd);
                break;
////            case 2:
//                System.out.print("Введите модель ЦПУ (например, \"Celeron\"): ");
//                scan = new Scanner(System.in);
//                var cpu = scan.nextLine();
//                testData.searchByCPU(cpu);
//                break;
            case 4:
                System.out.print("Enter notebook color: ");
                scan = new Scanner(System.in);
                String color = scan.nextLine();
                testData.searchByColor(color);
                break;
            case 5:
                System.out.print("Enter operating system (DOS/Linux/MacOS/Ubuntu/Windows): ");
                scan = new Scanner(System.in);
                String os = scan.nextLine();
                testData.searchByOS(os);
                break;
////            case 6:
//                System.out.print("Enter minimum price value: ");
//                scan = new Scanner(System.in);
//                Double minPrice = scan.nextDouble();
//                Double maxPrice;
//                do {
//                    System.out.print("Enter maximum price value: ");
//                    maxPrice = scan.nextDouble();
//                } while (maxPrice <= minPrice);
//                testData.searchByPrice(minPrice, maxPrice);
//                break;

//        }

        }
    }
}
