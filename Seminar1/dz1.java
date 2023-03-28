package Seminar1;

import java.util.Scanner;
public class dz1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число N для подсчета суммы треугольного числа: ");
        int num = Integer.parseInt(iScanner.nextLine());
        int summa = 0;
        for (int i=0; i<=num; i++){
            summa += i;
        }
        // System.out.printf("Введено %d \n", num);
        System.out.printf("Сумма чисел от 1 до %d будет равна %d\n", num, summa);
        System.out.println("Либо подсчет без цикла, а сразу по формуле 1/2n(n+1);");
        int res = (num/2)*(num+1);
        System.out.printf("Так же будет %d", res);
        // String result = String.format("%d + %d = %d \n", a,b,c);
    }
}
