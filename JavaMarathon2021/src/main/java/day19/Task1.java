package day19;
/**
 * В папке resources находится файл dushi.txt.
 * Этот файл содержит в себе полный текст произведения “Мертвые души” Н. В. Гоголя.
 * Вам необходимо прочитать этот файл и, используя структуру данных HashMap, подсчитать, сколько раз в этом произведении было использовано каждое слово.
 * После того, как подсчет будет произведен, вам необходимо вывести в консоль 100 самых часто используемых слов.
 * Изучите вывод и посмотрите, сколько раз в произведении было использовано слово “Чичиков” (фамилия главного героя).
 * Это число выпишите в коде в виде комментария (например: // Чичиков - 120).
 *
 * В тексте Н. В. Гоголя большое количество различных знаков препинания,
 * поэтому, чтобы выделить только слова из этого текста, нам недостаточно указать какой-то один разделитель в useDelimiter().
 * Вместо этого, в useDelimiter() мы указываем так называемое регулярное выражение (англ. regular expression).
 * Регулярные выражения - это особый язык, который описывает паттерны в тексте.
 * Наше регулярное выражение ("[.,:;()?!\"\\s–]+") описывает любую комбинацию знаков препинания и пробелов, которые могут встретиться в тексте между словами.
 * Поэтому, такой разделитель позволяет нам эффективно выделять слова из текста.
 * Для этого задания, нам не надо самостоятельно составлять регулярное выражение. Достаточно лишь применить данное регулярное выражение.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.»<>,:;()?!\"\\s–]+");
        Map<String, Integer> map = new HashMap<>();

        while (scanner.hasNextLine()){
            String line = scanner.next();
            String[] array = line.split(" ");
            for (String word: array){
                if (!map.containsKey(word)){
                    map.put(word,1);
                }else {
                    map.put(word, map.get(word)+1);
                }
            }
        }
        scanner.close();



        for (Map.Entry<String,Integer> entry : MapUtil.sortByValue(map).entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }

        System.out.println(MapUtil.sortByValue(map).size()); // Чичиков - 605
    }
}
