package PhoneBook;
import java.util.List;
import java.util.Scanner;

import PhoneBook.tasks.PhoneBook;
import PhoneBook.tasks.PhoneBook;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        
        // заполнили книгу
        phoneBook.add("Иван Иванов", "128-12-67");
        phoneBook.add("Светлана Петрова", "123-45-67");
        phoneBook.add("Кристина Белова", "987-65-43");
        phoneBook.add("Сидорова Анна", "555-55-55");
        phoneBook.add("Николай Сидоренко", "114-71-10");
        phoneBook.add("Анна Мусина", "144-27-10");
        phoneBook.add("Анна Крутова", "214-41-10");
        phoneBook.add("Иван Юрин", "119-40-12");
        phoneBook.add("Петр Лыков", "114-21-12");
        phoneBook.add("Павел Чернов", "114-21-14");
        phoneBook.add("Иван Иванов", "114-21-15");
        phoneBook.add("Петр Чернышов", "114-21-16");
        phoneBook.add("Мария Федорова", "114-21-18");
        phoneBook.add("Марина Светлова", "114-21-13");
        phoneBook.add("Мария Савина", "114-10-19");
        phoneBook.add("Иван Иванов", "114-20-10");
        phoneBook.add("Анна Крутова", "134-00-06");
        phoneBook.add("Мария Рыкова", "114-11-06");
        phoneBook.add("Марина Лугова", "114-41-06");
        phoneBook.add("Мария Рыкова", "114-21-06");
        phoneBook.add("Анна Владимирова", "114-29-06");
        phoneBook.add("Петр Лыков", "119-21-06");
        phoneBook.add("Иван Мечников", "184-21-06");
        phoneBook.add("Петр Петин", "224-21-06");
        phoneBook.add("Петр Лыков", "114-21-15");
        phoneBook.add("Иван Ежов", "114-71-06");
        System.out.println("Сохраненные контакты:");
        // phoneBook.prn();
        phoneBook.printAllContacts();
        System.out.println();
        System.out.println(phoneBook.getPhoneNumbers("Иван Иванов"));
        System.out.println("\nРанжирование по количеству номеров на одно лицо:");
        phoneBook.printDuplicateNames();
        


    } 
}
