package database;

public abstract class Notebook {
    String brand;
    String model;
    double screenSize;
    String resolution;
    String cpuBrand;
    byte coresAmount;
    int  cpuFrequency;
    int ramSize;
    int driveSize;
    String opSys;
    String color;
    double price;

    Notebook(String b, String m, double ss, String r, String cb, byte ca, int rs, int ds, String os, String c, double p)

    {
        this.brand = b;
        this.model = m;
        this.screenSize = ss;
        this.resolution = r;
        this.cpuBrand = cb;
        this.coresAmount = ca;
        this.cpuFrequency = cf;
        this.ramSize = cs;
        this.driveSize = ds;
        this.opSys = os;
        this.color = c;
        this.price = p;

    }
}
