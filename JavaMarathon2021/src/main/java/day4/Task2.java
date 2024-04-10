package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.
 *
 * Рекомендация:
 * Для поиска наибольшего и наименьшего элемента массива переменные,
 *     которые будут хранить эти значения необходимо либо инициализировать уже после заполнения массива, первым элементом этого массива
 * max =arr[0]
 * min = arr{0]
 * либо до массива, но самым "крайним" числом в диапазоне, т.е.
 * max = Integer.MIN_VALUE
 * min = Integer.MAX_VALUE
 * Это максимально универсальный подход.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int max = array[0];
        int min = array[0];
        int counter = 0;
        int sum = 0;
        for (int elements : array) {
            if (elements > max)
                max = elements;
            if (elements < min)
                min = elements;
            if (elements % 10 == 0) {
                counter++;
                sum += elements;
            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(counter);
        System.out.println(sum);

    }
}
