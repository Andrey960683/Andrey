package day7;

/**
 * Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 * В классе Самолет реализовать статический метод compareAirplanes,
 * который в качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2017, 15, 30000);
        Airplane airplane2 = new Airplane("S7", 2010, 20, 30000);
        Airplane.compareAirplanes(airplane1,airplane2);

    }
}