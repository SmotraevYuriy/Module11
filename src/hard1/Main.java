package hard1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));

        Set<Integer> result = new HashSet<>(list1);
        result.addAll(list2);
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);
        result.removeAll(intersection);
        System.out.println(result);
    }
}
