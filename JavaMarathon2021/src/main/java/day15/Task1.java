package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *  Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
 *  Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями, в качестве разделителя использован символ “;”).
 *  В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.
 *
 * До преобразования в csv это была таблица с тремя колонками:
 *
 * Название 						   Размер	   Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП			45		4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
 * ...
 *
 * Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах обуви, которой нет на складе (количество = 0).
 * Для этого реализуйте программу, которая принимает на вход csv файл и создает новый txt файл следующего содержания (должно получиться 11 строк):
 *
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 * ...
 *
 * Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
 * Учтите ситуацию, когда в файле может быть содержимое отличное от ожидаемого.
 * В нашем случае файл один и он корректен, но гипотетически может быть подан пустой файл или кол-во столбцов отличаться от трех.
 *
 * Новый файл необходимо создать самостоятельно, если в PrintWriter передается ссылка на файл:
 * File file = new File("src/main/resources/data.txt"); //создали ссылку на не существующий файл
 * file.getParentFile().mkdirs(); //создали самостоятельно файл
 * PrintWriter printWriter = new PrintWriter(file); //передали ссылку на файл в конструктор PrintWriter
 *
 * В случае, если в конструктор PrintWriter передается путь до файла, тогда сам файл будет создан автоматически:
 * PrintWriter writer = new PrintWriter("src/main/resources/missing shoes.txt", StandardCharsets.UTF_8); //передаем путь до файла и его кодировку
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter writer = new PrintWriter("C:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\missing shoes.txt", StandardCharsets.UTF_8);
            while (scanner.hasNextLine()){
                String[] array = scanner.nextLine().split(";");
                if (array.length==3) {
                    if ((Integer.parseInt(array[2]) == 0)) {
                        writer.println(array[0] + "," + array[1] + "," + array[2]);
                    }
                }else
                    writer.close();
            }
            writer.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        }
    }
}
