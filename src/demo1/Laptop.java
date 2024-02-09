package demo1;

public class Laptop {
    public String productType;
    private String ram;
    protected String screenSize;
    String productPrice;

    public Laptop(String productType, String ram, String screenSize, String productPrice) {
        this.productType = productType;
        this.ram = ram;
        this.screenSize = screenSize;
        this.productPrice = productPrice;
    }


    public String getProductType() {
        return productType;
    }

    public String getRam() {
        return ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "productType='" + productType + '\'' +
                ", ram='" + ram + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
