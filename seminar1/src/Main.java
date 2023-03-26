import java.util.Arrays;
import java.util.Scanner;

////Task_1
////        Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
////        а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
////
////        Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
////
////        Программа должна вывести одно натуральное число.
////
////        Sample Input 1:
////        10
////        3
////        2
////
////        Sample Output 1:
////        8
//
//import java.util.Scanner;
//
public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число высоту столба: ");
//        Integer h = scanner.nextInt();
//        System.out.print("Введите метров  в день: ");
//        Integer a = scanner.nextInt();
//        System.out.print("Введите метров ночь: ");
//        Integer b = scanner.nextInt();
//        int count = 0;
//        while (h - a > 0){
//            count ++;
//            h = h - a + b;
//        }
//        count++;
//        System.out.println(count + " дней");
//    }
//}
//
//
//Task_2
//        Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
//        если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку
//        на два прямоугольника).
//
//        Входные данные
//        Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек
//        в шоколадке не превосходит 30000.
//
//        Выходные данные
//        Программа должна вывести слово YES, если возможно отломить указанное число долек,
//        в противном случае вывести слово NO.
//
//        Sample Input 1:
//
//        3 2 4
//        Sample Output 1:
//
//        YES
//
//        import java.util.Scanner;
//
//class MyProgram{
//    public static void main(String[] args){
//
//    }
//}

//public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("n: ");
//    int n = scanner.nextInt();
//    System.out.print("m: ");
//    int m = scanner.nextInt();
//    System.out.print("k: ");
//    int k = scanner.nextInt();
//
//    if (k< n*m && k%n==0 || k%m == 0){
//        System.out.println("yes");
//    }
//    else {
//        System.out.println("no");
//    }
//}
//}


//    Task_3
//    В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал
//    пробег на 10% от предыдущего значения. По данному числу y определите номер дня,
//    на который пробег спортсмена составит не менее y километров.
//            Входные данные
//    Программа получает на вход действительные числа x и y
//
//    Выходные данные
//    Программа должна вывести одно натуральное число.
//
//    Sample Input:
//
//            10
//            20
//    Sample Output:
//
//            9
//
//            import java.util.Scanner;
//
//    class MyProgram{
//        public static void main(String[] args){
//
//        }
//    }
//

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("x: ");
//        double x = scanner.nextInt();
//        System.out.print("y: ");
//        double y = scanner.nextInt();
//        int count = 1;
//        while (x <= y){
//            x += x * 0.1;
//            count++;
//        }
//        System.out.println(count);
//    }
//}
//
//
//Task_4
//        Вводится натуральное число n. Вычислите n! ("эн-факториал") –
//        произведение всех натуральных чисел от 1 до n
//
//        n! = 1∙2∙3∙…∙ n.
//
//        Sample Input:
//
//        5
//        Sample Output:
//
//        120
//
//        import java.util.Scanner;
//
//class MyProgram{
//    public static void main(String[] args){
//
//    }
//}

//public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("n: ");
//    int n = scanner.nextInt();
//    int fak = 1;
//    for (int i = 1; i < n+1; i++) {
//        fak *= i;
//    }
//    System.out.println(fak);
//}
//}
//
//
//Task_5
//        Напишите программу, которая выводит в столбик целые числа от
//        a до b (a >= b) с шагом c. Границы включаются.
//
//        Входные данные
//        Заданы три целых числа а, b, с, где a > b
//
//        Выходные данные
//        Выведите единственное число - ответ на задачу.
//
//        Sample Input:
//
//        20
//        1
//        2
//        Sample Output:
//
//        20
//        18
//        16
//        14
//        12
//        10
//        8
//        6
//        4
//        2
//
//        import java.util.Scanner;
//
//class MyProgram{
//    public static void main(String[] args){
//
//    }
//}


//public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("a: ");
//    int a = scanner.nextInt();
//    System.out.print("b: ");
//    int b = scanner.nextInt();
//    System.out.print("c: ");
//    int c = scanner.nextInt();
//    for (int i = a; i > b; i-=c) {
//        System.out.println(i);
//
//    }
//
//}
//}
//
//
//
//Task_6
//        Вводится массив (сначала количество элементов, потом сами элементы).
//        Найдите сумму его элементов с чётными индексами и выведите её.
//        А потом выведите числа, которые суммировались.
//
//        Sample Input:
//
//        4
//        1
//        2
//        3
//        4
//        Sample Output:
//
//        4
//        1
//        3
//
//        import java.util.Scanner;
//
//class MyProgram{
//    public static void main(String[] args){
//
//    }
//}


public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Размер массива: ");
    int n = scanner.nextInt();
    int array[] = new int[n];
    int sum = 0;
    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
        if (i % 2 == 0){
            sum += array[i];
        }
    }
    System.out.println("Сумма: " + sum);
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0){
            System.out.println(array[i]);
        }

    }
}
}