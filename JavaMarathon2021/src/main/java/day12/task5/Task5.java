package day12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя, но и возраст.
 * Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом, чтобы участники были - объекты класса MusicArtist.
 * После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
 */
public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>(){{
            add(new MusicArtist("Grace Slick",33));
            add(new MusicArtist("Marty Balin",43));
            add(new MusicArtist("Paul Kantner",38));
            add(new MusicArtist("Jorma Kaukhonen",68));
            add(new MusicArtist("Jack Casady",75));
            add(new MusicArtist("Spencer Dryden",52));
        }};
        day12.task5.MusicBand musicBand1 = new day12.task5.MusicBand("Jefferson Airplane",1965,members1);

        List<MusicArtist> members2 = new ArrayList<>(){{
            add(new MusicArtist("John Lennon",33));
            add(new MusicArtist("Paul McCartney",54));
            add(new MusicArtist("Ringo Starr",73));
            add(new MusicArtist("George Harrison",63));
        }};
        day12.task5.MusicBand musicBand2 = new day12.task5.MusicBand("The Beatles", 1960,members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1,musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
