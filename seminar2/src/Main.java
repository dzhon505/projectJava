//Task 1
//Дана строка, в которой через пробел перечислены цифры.
//На следующей строке вводится цифра.
//Определите индексы первого и последнего ее вхождения
//
//Sample Input:
//
//4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
//4
//Sample Output:
//0
//28


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        String numbers = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Введите число: ");
//        String n = scanner.nextLine();
//        System.out.println(numbers.indexOf(n));
//        System.out.println(numbers.lastIndexOf(n));
//    }
//}

//Task 2
//Формат входных данных:
//На первой строке вводится любимая буква Маши, на второй - Олега.
//Затем вводится строка, в которой перечислены слова, которые написаны в газете.
//
//Формат выходных данных:
//На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько Олег.
//
//Sample Input:
//а
//в
//Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
//Sample Output:
//7
//5

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите букву: ");
//        String m = scanner.nextLine();
//        System.out.print("Введите букву: ");
//        String o = scanner.nextLine();
//        String stroka = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
//        String[] lst = stroka.split(" ");
//        int count_m = 0;
//        int count_o = 0;
//        for (int i = 0; i < lst.length; i++) {
//            if (lst[i].indexOf(m) >= 0) {
//                count_m++;
//            }
//            if (lst[i].indexOf(o) >= 0){
//                count_o++;
//            }
//        }
//        System.out.printf("%s, %s\n",count_m, count_o);
//    }
//}

//Task_3
//
//        Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес.
//        Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками.
//        В следующих трех строках показаны три правильных IP-адреса:
//
//        127.0.0.0
//        192.168.0.01
//        255.00.255.255
//        Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
//        Входные данные
//        На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
//
//        Выходные данные
//        Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
//
//        Примечание:
//        У вас не получится просто так взять и создать строку, которая содержит точку.
//        Иначе говоря строчка кода:
//
//        String s = ".";
//        просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки,
//        содержащей точку используйте экранирование.
//
//        String s = "\.";
//        Sample Input 1:
//
//        192.168.1.2
//        Sample Output 1:
//
//        YES
//        Sample Input 2:
//
//        192.11.690.0
//        Sample Output 2:
//
//        NO
//        Sample Input 3:
//
//        67.67.67
//        Sample Output 3:
//
//        NO
//


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        String d = ".";
//        int count = 0;
//        int count2 = 0;
//        boolean flag = false;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите IP: ");
//        String ip = scanner.nextLine();
//        String[] ip_lst = ip.split("");
//        for (int i = 0; i < ip_lst.length; i++) {
//            if (ip_lst[i].indexOf(d) == 0){
//                count++;
//            }
//        }
//        if(count == 3){
//            String[] ip_num = ip.split("\\.");
//            int[] res = new int[ip_num.length];
//            for (int i = 0; i < ip_num.length; i++) {
//                res[i] = Integer.parseInt(ip_num[i]);
//            }
//            for (int j = 0; j < res.length; j++) {
//                if (res[j] >= 0 && res[j] <= 255) {
//                    count2++;
//                }
//            }
//        }
//        if (count2 == 4){
//            System.out.println("YES");
//        }else System.out.println("NO");
//    }
//}


//Task_4
//
//        Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита.
//        Найдите, сколько раз в тексте встречается введённый символ в любом регистре.
//        Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
//
//        Sample Input:
//
//        Good morning my dear friend. My fish.
//        m
//        Sample Output:
//
//        3


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String stroka = scanner.nextLine();
//        System.out.print("Введите символ: ");
//        char ch = scanner.next().charAt(0);
//        String sLow = stroka.toLowerCase();
//        char[] res = sLow.toCharArray();
//        System.out.println(res);
//        String[] lst = sLow.split("");
//        for (int i = 0; i < res.length; i++) {
//            if(res[i] == ch){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}



//Task_5
//        Вводится строка, определите, каких символов в ней больше: цифр или букв?
//        Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим.
//        Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
//        Если же их равное количество, то выведите слово "Equal".
//
//        Sample Input:
//
//        34Hi56
//        Sample Output:
//
//        Digit



public class Main {
    import java.util.Scanner;
    public static void main(String[] args){
        String str = "asdhkas34898ojd";
        int didgitsCnt = 0;
        int alphaCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            if (Character.isDigit(item)) {
                didgitsCnt++;
            }
            if (Character.isLetter(item)) {
                alphaCnt++;
            }
        }
        if (didgitsCnt > alphaCnt) {
            System.out.println("Digit");
        }
        else System.out.println("Alpha");
    }
}
