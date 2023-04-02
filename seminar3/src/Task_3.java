import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    /*
        Дан список с десятью случайными числами, нужно отсортировать.
         */
    public static List<Integer> sortByCollections(List<Integer> lst) {
        lst.sort(null);
        return lst;
    }

    public static List<Integer> sortByComparator(List<Integer> lst) {
        lst.sort(Collections.reverseOrder());
        return lst;
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(lst);
        System.out.println(sortByCollections(lst));
        System.out.println(sortByComparator(lst));
    }
}