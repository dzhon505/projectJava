import java.util.*;

public class Task_5 {
    //Пусть дан произвольный список целых чисел
    public static void main(String[] args){
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));

        System.out.println(removeEvenValue(lst));
        System.out.println(getMin(lst));
        System.out.println(getMax(lst));
        System.out.println(getAverage(lst));
    }
    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> lst){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i) % 2 != 0){
                res.add(lst.get(i));
            }
        }
        return res;
    }
    // Найти минимальное значение
    public static Integer getMin(List<Integer> lst){
        int min = Collections.min(lst);

        return min;
    }
    //Найти максимальное значение
    public static Integer getMax(List<Integer> lst){
        int max = Collections.max(lst);

        return max;
    }
    // Найти среднее значение
    public static OptionalDouble getAverage(List<Integer> lst){
        OptionalDouble aver = lst.stream().mapToInt(a -> a).average();
        return aver;
    }
}
