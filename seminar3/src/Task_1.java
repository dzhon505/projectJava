/*Task_1
Напишите программу, которая считает натуральное число n с клавиатуры
и создаст список, в котором первый и последний элементы будут равны строчке 1,
а между ними будет n 0.
Выведите список на экран через пробел.

Sample Input:
3
Sample Output:
1 0 0 0 1
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){


/*
        Напишите программу, которая считывает натуральное число n с клавиатуры
        и создает список, в котором первый и последний элементы будут равны строчке 1,
        а между ними будет n 0.
        Sample Input:
        3
        Sample Output:
        1 0 0 0 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Type numbers: ");
        int n = sc.nextInt();
        List<Integer> listN = new ArrayList<>();
        listN.add(1);
        for (int i = 0; i < n; i++) {
            listN.add(0);
        }
        listN.add(1);
        System.out.println(listN);
    }
}