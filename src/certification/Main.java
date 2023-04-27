package certification;

import certification.notebook.Options;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Options.dataBase().toString());
//        Data testData = new Data();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите цифру, соответствующую необходимому критерию: \n" +
//                "1 - Бренд ноутбука\n" +
//                "2 - Объем оперативной памяти\n" +
//                "3 - Объем жесткого памяти\n" +
//                "4 - Цвет ноутбука\n" +
//                "5 - Операционная системв\n" +
//                "6 - Цена ноутбука\n");
//        int choise = scan.nextInt();
//        switch (choise) {
//            case 1:
//                System.out.print("Введите бренд ноутбука (ASUS/APPLE/HP/LENOVO/SAMSUNG): ");
//                scan = new Scanner(System.in);
//                String brand = scan.nextLine();
//                testData.searchByBrand(brand);
//                break;
//            case 2:
//                System.out.print("Введите модель ЦПУ (например, \"Celeron\"): ");
//                scan = new Scanner(System.in);
//                var cpu = scan.nextLine();
//                testData.searchByCPU(cpu);
//                break;
//            case 3:
//                System.out.print("Введите марку операционной системы (например, \"Windows 10\"): ");
//                scan = new Scanner(System.in);
//                var os = scan.nextLine();
//                testData.searchByOS(os);
//                break;
//            case 4:
//                System.out.print("Введите нижнюю границу цены: ");
//                scan = new Scanner(System.in);
//                Double minPrice = scan.nextDouble();
//                Double maxPrice;
//                do {
//                    System.out.print("Введите верхнюю границу цены: ");
//                    maxPrice = scan.nextDouble();
//                } while (maxPrice <= minPrice);
//                testData.searchByPrice(minPrice, maxPrice);
//                break;
//            case 5:
//                System.out.print("Введите нижнюю границу объема ОЗУ: ");
//                scan = new Scanner(System.in);
//                Integer minRAM = scan.nextInt();
//                Integer maxRAM;
//                do {
//                    System.out.print("Введите верхнюю границу объема ОЗУ: ");
//                    maxRAM = scan.nextInt();
//                } while (maxRAM <= minRAM);
//                testData.searchByRAM(minRAM, maxRAM);
//                break;
//        }

    }
}
