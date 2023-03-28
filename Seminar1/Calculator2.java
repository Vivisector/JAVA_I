package Seminar1;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите калькулиремую последовательность из одного действия:");
        String iString = scan.nextLine();
        scan.close();
        String[] string2 = iString.split("[+\\-*/]");
        int a = Integer.parseInt(string2[0]);
        int b = Integer.parseInt(string2[1]);
        char operator = ' '; // инициализировали переменную под оператор
        
        // поиск операнда
        for (int i = 0; i < iString.length(); i++) {
            
            if (iString.charAt(i) == '+' || iString.charAt(i) == '-' || iString.charAt(i) == '*'
                    || iString.charAt(i) == '/') {
                operator = iString.charAt(i);
                break;
            }
        }

        double result=0;
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else {
            result = a / b;
        }

        // System.out.printf("d% + c% + d% = d%", a, operator, b, result);
        System.out.println("=" + result);
    }
}
