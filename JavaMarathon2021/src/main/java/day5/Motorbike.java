package day5;

public class Motorbike {
    private String model;
    private String color;
    private int yearManufacture;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public Motorbike(String model, String color, int yearManufacture){
        this.model =model;
        this.color=color;
        this.yearManufacture= yearManufacture;
    }

}
