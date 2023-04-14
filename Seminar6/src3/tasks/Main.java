package src3.tasks;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Vaio", 4, 500, "Windows 10", "Black");
        Laptop laptop2 = new Laptop("Asus", 16, 1000, "Windows 10", "Silver");
        Laptop laptop3 = new Laptop("MSI", 8, 500, "Linux", "Blue");
        Laptop laptop4 = new Laptop("Acer", 4, 250, "MacOS", "Black");

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        System.out.println("Набор: " + laptops);
    

        Map<String, String> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

    System.out.println("Введите цифру, соответствующую необходимому критерию:");
    System.out.println("1 - Объем оперативной памяти");
    System.out.println("2 - Объем HDD");
    System.out.println("3 - Операционная система");
    System.out.println("4 - Цвет");
    String choice = scanner.nextLine();
        
        System.out.println("Введите минимальное значение для выбранного критерия или цвет:");
        String value = scanner.nextLine();
        
        filters.put(choice, value);
        Set<Laptop> filteredLaptops = filterLaptops(laptops, filters);
        
        System.out.println("Результаты фильтрации: " + filteredLaptops);


    }
    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, String> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        
        for (Laptop laptop : laptops) {
            boolean match = true;
            
            for (String key : filters.keySet()) {
                String value = filters.get(key);
                
                switch (key) {
                    case "1":
                        if (laptop.getRam() < Integer.parseInt(value)) {
                            match = false;
                        }
                        break;
                    case "2":
                        if (laptop.getHdd() < Integer.parseInt(value)) {
                            match = false;
                        }
                        break;
                    case "3":
                        if (!laptop.getOs().equals(value)) {
                            match = false;
                        }
                        break;
                    case "4":
                        if (!laptop.getColor().equals(value)) {
                            match = false;
                        }
                        break;
                }
            }
            
            if (match) {
                filteredLaptops.add(laptop);
            }
        }
        
        return filteredLaptops;
    }

}
