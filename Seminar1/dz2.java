package Seminar1;

public class dz2 {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println("Все простые числа от 0 до 1000:");
        for (int i = 1; i<=1000; i++){
            boolean isPrime  = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){isPrime = false; break;}
            }
            if (isPrime == true){
                System.out.printf(i + ", ");
             }
        }
    }
}
