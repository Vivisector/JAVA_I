
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class EvenRemover {
    public static void main(String[] args) {
        
    
    Random random = new Random();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; ++i) {
        list.add(random.nextInt(50));
    }
    System.out.println("Дан массив:");
                for (int i:list){
                    System.out.print(i + " ");
                }
                System.out.println("");
                System.out.println("Без четных элементов:");
    
    // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<Integer> newList = new ArrayList<>();

        for (int elem : list) {
            if (elem % 2 != 0) {
                newList.add(elem);
            }
        } for (int i:newList){
            System.out.print(i + " ");}
    }
}
