package medium2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String numbers = "1 2 3 3 4 4 5 5 5 7 9 0 8 7 7 9 6";
        String[] arrayNumbers = numbers.split(" ");
        Set numberSet = new HashSet<>(Arrays.asList(arrayNumbers));
        System.out.println(numberSet.size());

    }
}
