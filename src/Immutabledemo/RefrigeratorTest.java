package Immutabledemo;

import java.lang.module.Configuration;

public class RefrigeratorTest {

    public static void main(String[] args) {

        Refrigerator refrigerator=new Refrigerator("Samsung","Double door","236 Liters","Pink");

       // System.out.println("Refrigerator details="+ refrigerator);

        String name=refrigerator.getProductTpye();
        System.out.println("Refrigerator Type = " + name );

        String configaration= refrigerator.getConfigaration();
        System.out.println("Configaration = " + configaration);

        String capacity=refrigerator.getCapacity();
        System.out.println("Capacity = " + capacity);

        String color=refrigerator.getColor();
        System.out.println("Color = " + color);

    }
}
