import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {


        /*
        Напишите программу, которая считывает натуральное число n с клавиатуры
        и создаст список, в котором будут храниться строковые представления чисел от 0 до n-1.
        Затем программа считывет число m (m <= n) и строку s.
        Вставьте строку s на позицию m/
        Выведите список на экран через пробел.
        Sample Input:
        5
        2
        Строка
        Sample Output:

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Type numbers: ");
        int n = sc.nextInt();
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            lst.add(String.valueOf(i));
        }
        System.out.print("Type numbers: ");
        int m = sc.nextInt();
        System.out.print("Type word: ");
        String s = sc.next();
        lst.add(m, s);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}
