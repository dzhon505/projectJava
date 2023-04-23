import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        AddNewContact("Смирнов Михаил", "89112548965");
        AddNewContact("Федоров Николай", "89265892136");
        AddNewContact("Воронов Николай", "89015823971");
        AddNewContact("Федоров Николай", "89311596413");
        AddNewContact("Воронов Николай", "89023697845");
        AddNewContact("Воронов Николай", "89031472356");

        for (Map.Entry<String, ArrayList<String>> entry:
                PhoneBook.entrySet()){
            System.out.println(entry);
        }
    }
    public static Map<String, ArrayList<String>> PhoneBook = new HashMap<>();
    public static void AddNewContact(String name, String phoneNumber){
        if (PhoneBook.containsKey(name)){
            PhoneBook.get(name).add(phoneNumber);
        }else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            PhoneBook.put(name, numbers);
        }
    }
}