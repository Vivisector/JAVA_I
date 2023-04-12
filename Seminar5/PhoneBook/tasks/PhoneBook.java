package PhoneBook.tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> contacts = new HashMap<>();
    // List<String - значения телефонных номерв (их может быть несколько)

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.get(name);
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
            contacts.put(name, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
    }

    public void printAllContacts() {
        for (String name : contacts.keySet()) {
            List<String> numbers = contacts.get(name);
            System.out.println(name + ": " + numbers);
        }
    }
    
    public List<String> getPhoneNumbers(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void removePhoneNumber(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.get(name);
        if (phoneNumbers != null) {
            phoneNumbers.remove(phoneNumber);
            if (phoneNumbers.isEmpty()) { // если телефонов у контакта не осталось, контак удаляется из книги
                contacts.remove(name);
            }
        }
    }
}
