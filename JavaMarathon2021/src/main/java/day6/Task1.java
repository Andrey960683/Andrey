package day6;

/**
 * В классах Автомобиль и Мотоцикл реализуйте два метода:
 * void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
 * и возвращает разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
 *
 * Пример: inputYear передан как 2020, поле класса year инициализировано числом 2010 или наоборот, должно быть возвращено одно и тоже положительное число 10.
 * Такого понятия как “некорректный ввод” или любое другое сигнализирующее об ошибке, здесь быть не может
 *
 * В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Volvo");
        car.setColor("Red");
        car.setYear(2013);

        car.info();
        System.out.println(car.yearDifference(2000));

        Motorbike motorbike =new Motorbike("BMW", "Black", 2018);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2000));
    }
}
