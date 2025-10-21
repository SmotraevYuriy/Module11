package medium2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> numbersList = new HashSet<>();
        String numbers = " 1 2 3 3 4 4 5 5 5 7 9 0 8 7 7 9 6";
        String[] arrayNumbers = numbers.split(" ");
        for (String number : arrayNumbers) {
            if (!number.isEmpty()) {
                numbersList.add(number);
            }
        }
        System.out.println(numbersList.size());

    }
}
