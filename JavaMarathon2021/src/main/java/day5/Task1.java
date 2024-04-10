package day5;

/**
 * Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car publicCar = new Car();
        publicCar.setModel("Volvo");
        System.out.println("Модель: " + publicCar.getModel());
        publicCar.setColor("Red");
        System.out.println("Цвет: " + publicCar.getColor());
        publicCar.setYearManufacture(2013);
        System.out.println("Год выпуска: " + publicCar.getYearManufacture());
    }
}
