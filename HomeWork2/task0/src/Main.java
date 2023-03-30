/*Task_0
public class Task_0 {

    // Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
    public static void main(String[] args) {

    }

    public String findJewelsInStones(String jewels, String stones) {

        return "";
    }
}*/
public class Main {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        StringBuilder res = new StringBuilder();
        String[] lst_jew = jewels.split("");
        for (String s : lst_jew) {
            int count = stones.length() - stones.replace(s, "").length();
            res.append(s).append(count);
        }
        System.out.println(res);
    }
}