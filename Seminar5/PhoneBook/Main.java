package PhoneBook;
import java.util.List;
import java.util.Scanner;

import PhoneBook.tasks.PhoneBook;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        
        // заполнили книгу
        phoneBook.addContact("Иванов Иван", "123-45-67");
        phoneBook.addContact("Петров Петр", "987-65-43");
        phoneBook.addContact("Сидорова Анна", "555-55-55");
        phoneBook.addContact("Иванов Иван", "111-11-11");
        phoneBook.addContact("Николай Сидоренко", "114-21-10");
        
        phoneBook.printAllContacts();

    } 
}
