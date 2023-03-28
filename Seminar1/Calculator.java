package Seminar1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Введите первое число");
    
        double firstNumber = scanner.nextDouble();
    
        System.out.println("Введите второе число");
    
        double secondNumber = scanner.nextDouble();
    
        System.out.println("Введите оператор (+, -, *, /)");
    
        char operator = scanner.next().charAt(0);
    
        double result = 0;
    
        if (operator=='+'){
            result = firstNumber + secondNumber;
        }else if(operator=='-'){
            result = firstNumber - secondNumber;
        }else if(operator=='*'){
                result = firstNumber * secondNumber;
        }else if(operator=='/'){
                result = firstNumber / secondNumber;
        }
        System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+result);   
    }
}
