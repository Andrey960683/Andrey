package day18;

/**
 * Вам необходимо создать двоичное дерево поиска, изображенное на картинке выше.
 *
 * Для этого создайте класс “Узел” (англ. Node), объекты которого будут содержать само значение узла и поля-ссылки на два других узла (левый и правый сын).
 * Затем, создайте корневой (англ. root) узел (со значением 20).
 * После этого, необходимо реализовать метод, который будет добавлять новые узлы в ваше дерево.
 * Этот метод должен принимать в качестве аргументов добавляемое значение и ссылку на корень дерева.
 * Проходясь по дереву, он должен вставлять новый узел в правильное место дерева.
 *
 * Когда двоичное дерево, изображенное выше, будет создано, необходимо используя рекурсию вывести в консоль все числа из этого двоичного дерева поиска в отсортированном виде.
 * Ваше рекурсивное решение должно работать для любого корректного двоичного дерева поиска.
 * Этот алгоритм называется “обход в глубину” (иногда называют “поиск в глубину”).
 * Ваш рекурсивный метод (пусть он будет называться dfs) должен в качестве единственного аргумента принимать ссылку на корень дерева (root).
 *
 * Вызов: dfs(root);
 * Вывод в консоль: 5 8 11 14 15 16 18 20 22 23 24 27 150
 */
public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int [] numbers = {14,23,11,16,22,27,5,15,18,24,150,8};
        for (int number: numbers){
            addNode(number,root);
        }
        dfs(root);

    }
    public static void dfs(Node node){
        if (node==null)
            return;
        dfs(node.getLeft());
        System.out.print(node.getValue()+ " ");
        dfs(node.getRight());
    }
    public static void addNode(int insertValue, Node root) {
        if(root == null)
            throw new IllegalArgumentException("Корневой узел не может быть равен null");

        Node nextNode = root ;
        Node current = null;

        while (nextNode != null){
            current = nextNode;
            if (insertValue< current.getValue()){
                nextNode = current.getLeft();
            }else
                nextNode= current.getRight();
        }
        if (insertValue< current.getValue()){
            current.setLeft(new Node(insertValue));
        }else
            current.setRight(new Node(insertValue));


    }
}
class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}