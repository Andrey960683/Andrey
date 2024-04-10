package day6;
/**
 *  Создать класс Самолет (Airplane) с полями:
 * manufacturer (изготовитель)
 * year (год выпуска)
 * length (длина)
 * weight (вес)
 * fuel (количество топлива в баке)
 *
 *
 * Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
 *
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “количество топлива в баке” установить равным 0).
 * В конструкторе для передачи полям значений использовать ключевое слово this.
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
 *
 * Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и дозаправляет топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения. Вызвать метод info().
 */
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
