// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
//        и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
//        фильтрации можно также в Map.

package certification.notebook;


import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private Options.BrandPick brand;    // Бренд ноутбука
    private StringBuilder model;    // Модель ноутбука
    private int ram;         // Объем оперативной памяти
    private int hdd;         // Объем жесткого диска
    private Options.ColorPick color;    // Цвет ноутбука
    private Options.OpSysPick opSys;    // операционная система
    private double price;    // цена ноутбука

    public Notebook(Options.BrandPick brand, StringBuilder model, int ram, int hdd, Options.ColorPick color, Options.OpSysPick opSys, int price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
        this.opSys = opSys;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nNotebook{" +
                brand + " " +
                model + ", " +
                "RAM " + ram + " GB, " +
                "HDD " + hdd + " GB, " +
                color + ", " +
                opSys +
                ", Price: " + price + " rub." +
                '}';
    }

    public static List<String> filterCriteria() {
        List<String> list = new ArrayList<>();
        list.add("brand");
        list.add("model");
        list.add("ram");
        list.add("hdd");
        list.add("color");
        list.add("opSys");
        list.add("price");

        return list;

    }
}


//    /**
//     * Поиск по Бренду ноутбука
//     *
//     * @param inBrand
//     * @return
//     */
//    public Boolean isMatchBrand(String brand) {
//        return findStr(brand, inBrand);
//    }
//
//    /**
//     * Поиск по ОС
//     *
//     * @param inOS
//     * @return
//     */
//    public Boolean isMatchOSType(String inOS) {
//        return findStr(opSys, inOS);
//    }
//
//    /**
//     * Поиск по цене
//     *
//     * @param minPrice Минимальная цена
//     * @param maxPrice Максимальная цена
//     * @return
//     */
//    public Boolean isMatchPrice(Double minPrice, Double maxPrice) {
//        return price >= minPrice && price <= maxPrice;
//    }
//
//    /**
//     * Поиск по объему ОЗУ
//     *
//     * @param minRAM Минимальная граница
//     * @param maxRAM Максимальная граница
//     * @return
//     */
//    public Boolean isMatchRam(Integer minRAM, Integer maxRAM) {
//        return volRAM >= minRAM && volRAM <= maxRAM;
//    }
//
//

//
//}