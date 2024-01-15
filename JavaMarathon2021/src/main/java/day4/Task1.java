package day4;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /**
     * С клавиатуры вводится число n - размер массива.
     * Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
     * Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
     * а) Длине массива
     * б) Количестве чисел больше 8
     * в) Количестве чисел равных 1
     * г) Количестве четных чисел
     * д) Количестве нечетных чисел
     * е) Сумме всех элементов массива
     *
     * Пример:
     * Введено число 10. Сгенерирован следующий массив:
     * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
     *
     * Информация о массиве:
     * Длина массива: 10
     * Количество чисел больше 8: 1
     * Количество чисел равных 1: 0
     * Количество четных чисел: 6
     * Количество нечетных чисел: 4
     * Сумма всех элементов массива: 46
     */
    public static void main(String[] args) {
        Scanner scannerLenght = new Scanner(System.in);
        Random arrayRand = new Random();
        int[] array = new int[scannerLenght.nextInt()];
        int arrayLenght= array.length;
        int countOver8 = 0;
        int countEquals1 =0;
        int countDell2 = 0;
        int countNotDell2 =0;
        int sum =0;


        for (int i = 0;i<array.length;i++ ){
            array [i] = arrayRand.nextInt(11);

            if(array[i]>8){
                countOver8++;
            }
            if(array[i]==1) {
                countEquals1++;
            }
            if(array[i]%2==0) {
                countDell2++;
            } else{
                countNotDell2++;
            }
                sum=sum+array[i];
            }
        System.out.println("Введено число "+ arrayLenght +". Сгенерирован следующий массив:" );
        System.out.println(Arrays.toString(array) );
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Количество чисел больше 8: " +countOver8);
        System.out.println("Количество чисел равных 1: "+ countEquals1);
        System.out.println("Количество четных чисел: "+ countDell2);
        System.out.println("Количество нечетных чисел: "+ countNotDell2);
        System.out.println("Сумма всех элементов массива: "+ sum);
        }
    }


