import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        splitNames(workers);
    }
    public static List<String> workers = new ArrayList<>(Arrays.asList(
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
    ));
    public static void removeOne(Map<String, Integer> lst) {
        lst.entrySet().removeIf(entry -> entry.getValue() == 1);
        List<Map.Entry<String, Integer>> lst1 = new ArrayList<>(lst.entrySet());
        lst1.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println(lst1);
    }
    public static void splitNames(List<String> workers){
        Map<String, Integer> names = new HashMap<>();
        for (String worker:
                workers) {
            String workerName = worker.split(" ")[0];
            if (names.containsKey(workerName)){
                names.put(workerName, names.get(workerName)+1);
            }else {
                names.put(workerName, 1);
            }
        }
        removeOne(names);

        List<Map.Entry<String, Integer>> lst = new ArrayList<>(names.entrySet());
        lst.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    }
}



