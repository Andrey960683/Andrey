package day12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать таким образом,
 * чтобы в группу можно было добавлять и удалять участников списком (по несколько участников за раз, а не по одному).
 * Под участником понимается строка (String) с именем и фамилией.
 *
 * Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
 * Название метода: transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
 * В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
 * Проверить состав групп после слияния.
 */
public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>(){{
            add("Grace Slick");
            add("Marty Balin");
            add("Paul Kantner");
            add("Jorma Kaukhonen");
            add("Jack Casady");
            add("Spencer Dryden");
        }};
        MusicBand musicBand1 = new MusicBand("Jefferson Airplane",1965,members1);

        List<String> members2 = new ArrayList<>(){{
            add("John Lennon");
            add("Paul McCartney");
            add("Ringo Starr");
            add("George Harrison");
        }};
        MusicBand musicBand2 = new MusicBand("The Beatles", 1960,members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1,musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
