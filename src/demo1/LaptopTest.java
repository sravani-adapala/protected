package demo1;

public class LaptopTest {
    public static void main(String[] args) {

        Laptop laptop=new Laptop("Dell","8 GB","15.6","75000");
        String name= laptop.getProductType();
        System.out.println("ProductType="+laptop);

    }
}
