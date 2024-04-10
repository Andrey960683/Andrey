package day8;

public class Airplane {
    private String manufacture;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacture, int year, int length, int weight) {
        this.manufacture = manufacture;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public String toString(){
        return "Изготовитель: " + manufacture + ", год выпуска: " +year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacture + ", год выпуска: " +year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }

    public void fillUp(int n){
        fuel+=n;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
