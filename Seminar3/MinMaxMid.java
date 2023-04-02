import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MinMaxMid {
    public static void main(String[] args) {
        Random random = new Random();
        // генерируем целочисленный массив
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(random.nextInt(50));
        }
        System.out.println("Дан целочисленный массив:");
                    for (int i:list){
                        System.out.print(i + " ");
                    }
                    System.out.println(""); //отбивка пустой строкой
                                                            
                    // ищем минимальное
                    int min = list.get(0);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) < min) {
                            min = list.get(i);
                        }
                    }
                    System.out.println("Min: " + min);
                    // ищем максимальное
                    int max = list.get(0);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) > max) {
                            max = list.get(i);
                        }
                    }
                    System.out.println("Max: " + max);
                    // ищем среднее арифметическое
                    int sum = 0;
                    for (int i = 0; i < list.size(); i++) {
                        sum += list.get(i);
                    }
                    double average = (double) sum / list.size();
                    System.out.println("Average: " + average);
    }
}
