package demo2;

import demo1.Laptop;
import demo1.LaptopTest;

public class LaptopExample extends Laptop {
    public LaptopExample(String productType, String ram, String screenSize, String productPrice) {
        super(productType, ram, screenSize, productPrice);
    }

    public static void main(String[] args) {
        LaptopExample laptop= new LaptopExample("Dell","8 GB","14.5","50000");
        System.out.println(laptop);

    }


}


