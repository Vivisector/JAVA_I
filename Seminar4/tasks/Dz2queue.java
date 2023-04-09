/*
 * 
 Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя
 */
package tasks;
import java.util.LinkedList;
import java.util.Arrays;

public class Dz2queue {
    public LinkedList<Object> queue = new LinkedList<>();

    public void enqueue(Object item) {
        queue.add(item);
    }

    public void enqueue(int[] arr) {
        for (int item : arr) {
            queue.add(item);
        }
    }

    public Object dequeue() {
        return queue.removeFirst();
    }

    public Object first() {
        return queue.getFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 45, 22, 12, 7}; // Наш массив
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Dz2queue q = new Dz2queue();
        q.enqueue(arr); // Наполняем очередь элементами нашего массива
        System.out.println("Заполненная очередь:");
        // System.out.println("Исходный массив: " + Arrays.toString(q));
        System.out.println(q + " - так и не понял, как вывести читабельный список элементов очереди"); // пока не понял, как показать поэлементно

        System.out.println("Первый элемент очереди: " + q.first()); // Выводим первый элемент очереди (1)
        // q.dequeue(); // Удаляем первый элемент (1)
        System.out.println("Удаляем первый элемент " + "(" + q.dequeue() + ")" + " и показываем ставший первым: " + q.first()); // Выводим первый элемент очереди (3)
    }
}
