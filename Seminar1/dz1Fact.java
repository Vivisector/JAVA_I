package Seminar1;

import java.util.Scanner;
public class dz1Fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для подсчета факториала: ");
        int num = Integer.parseInt(scan.nextLine());
        int res = 1;
        for (int i = 1; i<=num; i++)
            res *= i;
    System.out.printf("Произведение всех чисел от 1 до %d будет равно %d\n", num, res);
    // System.out.println(res);
    }
}
