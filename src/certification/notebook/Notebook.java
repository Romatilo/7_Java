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
import java.util.*;

public class Notebook {
    private Options.BrandPick brand;    // Бренд ноутбука
    private StringBuilder model;        // Модель ноутбука
    private int ram;         // Объем оперативной памяти
    private int hdd;         // Объем жесткого диска
    private Options.ColorPick color;    // Цвет ноутбука
    private Options.OpSysPick opSys;    // Операционная система
    private double price;    // Цена ноутбука

    public Notebook(Options.BrandPick brand, StringBuilder model, int ram, int hdd,
                    Options.ColorPick color, Options.OpSysPick opSys, int price) {
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
        return "\nNotebook [" +
                brand + " " +
                model + ", " +
                "RAM " + ram + " GB, " +
                "HDD " + hdd + " GB, " +
                color + ", " +
                opSys +
                ", Price: " + price + " rub." +
                ']';
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