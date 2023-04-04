import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_4 {
    public static void printResultOfCheck(List<String> lst){

    }
    public static void main(String[] args) {
        /*
        Дан список содержащий строки в строковом формате.
        С помощью итератора пройти по списку и вывести в консоль что является
        строкой, а что числом
         */

        List<String> lst = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        for (String el : lst) {
            try {
                Integer.parseInt(el);
                System.out.println(el + " число");
            } catch (NumberFormatException e) {
                System.out.println(el + " строка");
            }
        }
    }
}

