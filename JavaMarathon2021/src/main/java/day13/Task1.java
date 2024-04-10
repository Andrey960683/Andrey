package day13;

/**
 * В методе main() этого класса необходимо создать трех пользователей.
 * Затем необходимо:
 * Отправить 2 сообщения от пользователя 1 пользователю 2
 * Отправить 3 сообщения от пользователя 2 пользователю 1
 * Отправить 3 сообщения от пользователя 3 пользователю 1
 * Отправить 3 сообщения от пользователя 1 пользователю 3
 * Отправить 1 сообщение от пользователя 3 пользователю 1
 *
 * Сообщения могут быть любыми.
 * После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
 */
public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user2.sendMessage(user1,"eeeeeeeeeeee");
        user2.sendMessage(user1,"yyyyyyyyyyy");
        user2.sendMessage(user1,"uuuuuuuuuuu");

        user3.sendMessage(user1,"tttttttttttt");
        user3.sendMessage(user1,"iiiiiiiiii");
        user3.sendMessage(user1,"oooooooooooooo");

        user1.sendMessage(user3,"eeeeeeeeeee");
        user1.sendMessage(user3,"hhhhhhhhhhhhhh");
        user1.sendMessage(user3,"kkkkkkkkkkkkk");

        user3.sendMessage(user1,"lllllllllllllll");

        MessageDatabase.showDialog(user1,user3);

    }
}
