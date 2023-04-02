/*Task_1
public class Task_1 {

    // Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {

    }

    public String shuffle(final String s, final int[] index){

        return "";
    }
}*/

public class Task_1 {
    public static void main(String[] args) {
        String s = "cba";
        StringBuilder builder = new StringBuilder();
        String[] lst_s = s.split("");
        int[] index = new int[] {3, 2, 1};
        for (int i = 0; i < s.length(); i++) {
            builder.append(lst_s[index[i]-1]);
        }
        System.out.println(builder);
    }
}