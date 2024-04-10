package day12;

import java.util.ArrayList;
import java.util.List;

/**
 *  Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
 * Для заполнения списка реализуйте метод, который принимает числа от, до, и ссылку на список.
 * Вывести список.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        listNumber(0,30,number);
        listNumber(300,350,number);
        System.out.println(number);
    }

    public static void listNumber(int a,int b, List<Integer> list){
        for (int i =a; i<=b;i++){
            if(i%2==0){
                list.add(i);
            }
        }
    }
}
