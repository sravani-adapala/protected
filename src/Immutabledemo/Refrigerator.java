package Immutabledemo;

public class Refrigerator {
    private String productTpye;
    private String configaration;
    private String capacity;
    private String color;

    public Refrigerator(String productTpye, String configaration, String capacity, String color) {
        this.productTpye = productTpye;
        this.configaration = configaration;
        this.capacity = capacity;
        this.color = color;
    }

    public String getProductTpye() {
        return productTpye;
    }
    public String getConfigaration(){
        return configaration;
    }
    public String getCapacity(){
        return capacity;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "productTpye='" + productTpye + '\'' +
                ", configaration='" + configaration + '\'' +
                ", capacity='" + capacity + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}