package PhoneBook.tasks;
import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        contacts.get(name).add(phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void removePhoneNumber(String name, String phoneNumber) {
        contacts.get(name).remove(phoneNumber);
    }

    public List<String> getPhoneNumbers(String name) {
        System.out.print("У [" + name + "] такие номера: ");
        return contacts.get(name);
    }

    public void printAllContacts() {
        for (String name : contacts.keySet()) {
            List<String> numbers = contacts.get(name);
            System.out.println(name + ":: " + numbers);
        }
    }
    public void prn(){
        System.out.println(contacts.keySet());
    }
     // Вывод всех имён с повторами
     public void printDuplicateNames() {
        // Создает новую карту для хранения количества имен
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : contacts.keySet()) {
        List<String> numbers = contacts.get(name);
            if (numbers.size() > 1) {
            System.out.println(name + ": " + numbers);
            }
        }
    }
}
