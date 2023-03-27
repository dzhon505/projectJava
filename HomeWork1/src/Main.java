import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }



//    Task_1.
//    Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
//    Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
//
//    Sample Input:
//
//            8
//            11
//    Sample Output:
//
//            512
//            1331
    static void task1(){
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(i, 3);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println(num1+" в кубе "+arr[num1]);
        System.out.println(num2+" в кубе "+arr[num2]);
    }

//
//
//Task_2.
//        Вводится число n, затем n чисел целых, по одному на каждой строке.
//        Затем вводится число, на которое нужно умножить все введённые выше числа.
//        Выведите на экран результат умножения построчно.
//
//        Sample Input:
//
//        4
//        1
//        2
//        3
//        5
//        2
//        Sample Output:
//
//        2
//        4
//        6
//        10

    static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int k = scanner.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите множитель: ");
        int m = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * m);
        }
    }

//
//
//Task_3.
//        Реализовать простой калькулятор (+,-,=,*), только с целыми числами.


    static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Укажите операцию: ");
        char operation = scanner.next().charAt(0);
        switch (operation) {

            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;

        }
    }}
//
//
//Task_4. *
//        +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
//        заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение
//        до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

