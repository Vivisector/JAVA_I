package Seminar2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dz1sorting {

    public static void main(String[] args) throws IOException {

        // Создаем массив случайных чисел
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 20 + 1);
        }

        // Подготавливаем документ для лога
        String fileName = "log.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(fileName, true);

        // Выводим исходный массив в консоль
        System.out.print("Исходный массив: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // пустая строка для отбивки

        // Запускаем сортировку
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            // Печатаем значения после каждой итерации
            System.out.print("Итерация " + (i + 1) + ": ");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();

            // Записываем результат в лог
            for (int value : array) {
                writer.write(String.valueOf(value) + " ");
            }
            writer.write("\n");
            writer.flush();
        }

        // Закрываем документ
        writer.close();
    }


}