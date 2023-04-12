package RomeArabic.tasks;
import java.util.*;
public class RomanArabic {

    
public static void romanToArabic() {
 
        int result = 0;
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] arabics = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
              // Ввод римского числа
      System.out.println("Enter roman number: ");
      Scanner scanner = new Scanner(System.in);
      String roman = scanner.nextLine().toUpperCase ();

        for (int i = 0; i < romans.length; i++) {
            while (roman.startsWith(romans[i])) {
                result += arabics[i];
                roman = roman.substring(romans[i].length());
            }
        }
        System.out.println(result);
 
        // return result;
    }
}
