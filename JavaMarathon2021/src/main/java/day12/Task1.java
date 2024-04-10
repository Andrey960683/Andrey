package day12;


import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
 * Вывести список в консоль.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String>cars = new ArrayList<>(){{
                add("Honda");
                add("Hyundai");
                add("Lada");
                add("Volkswagen");
                add("Lexus");
            }};
        System.out.println(cars);
        cars.add(2,"Volvo");
        cars.remove(0);
        System.out.println(cars);
    }
}
