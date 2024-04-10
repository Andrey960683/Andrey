package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;


/**
 *  *Выполнять в подпапке task3 в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
 * Перемешать список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года.
 * Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
 * Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */
public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Tame impala",2007);
        MusicBand band2 = new MusicBand("The Cure",1976);
        MusicBand band3 = new MusicBand("The Batles",1960);
        MusicBand band4 = new MusicBand("Gruppa Skryptonite", 2018);
        MusicBand band5 = new MusicBand("Pompeya",2006);
        MusicBand band6 = new MusicBand("Пасош", 2014);
        MusicBand band7 = new MusicBand("Jefferson Airplane", 1965);
        MusicBand band8 = new MusicBand("Jimi Hendrix Experience",1966);
        MusicBand band9 = new MusicBand("Kedr Livanskiy",2008);
        MusicBand band10 = new MusicBand("Кровосток", 2003);

        List<MusicBand> musicBandList = new ArrayList<>(){{
            add(band1);
            add(band2);
            add(band3);
            add(band4);
            add(band5);
            add(band6);
            add(band7);
            add(band8);
            add(band9);
            add(band10);
        }};
        System.out.println(musicBandList);
        shuffle(musicBandList);
        System.out.println(musicBandList);

        List<MusicBand> musicBandAfter = new ArrayList<>(groupsAfter2000(musicBandList));
        System.out.println(musicBandAfter);

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBandAfter2000 = new ArrayList<>();
        for (MusicBand band: bands){
            if(band.getYear()>2000){
                musicBandAfter2000.add(band);
            }
        }
        return musicBandAfter2000;
    }

}
