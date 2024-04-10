package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        Map<Integer, Point> map = new HashMap<>();
        while (scanner.hasNextLine()){
            String[] carArray =scanner.nextLine().split(" ");
            int [] array = new int[carArray.length];
            int i = 0;
            for (String s : carArray){
                array[i]= Integer.parseInt(s);
                map.put(array[0], new Point(array[1],array[2]));
                i++;
            }
        }scanner.close();
        for (Map.Entry<Integer,Point> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Пожалйста введите координгаты:");
        System.out.println("x1:");
        int x1 =scanner1.nextInt();
        System.out.println("x2:");
        int x2 =scanner1.nextInt();
        System.out.println("y1:");
        int y1 =scanner1.nextInt();
        System.out.println("y2:");
        int y2 =scanner1.nextInt();
        for (Map.Entry<Integer, Point> entry : map.entrySet()){
            if (entry.getValue().getX()>x1 && entry.getValue().getX()<x2 && entry.getValue().getY()> y1 && entry.getValue().getY()< y2){
                System.out.println(entry.getKey());
            }
        }

    }
}

