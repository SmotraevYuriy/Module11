package medium4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> countries = Arrays.asList(
                "Япония", "Канада", "Россия", "Греция", "Австралия",
                "Австрия", "Китай", "США", "Франция", "Германия"
        );

        Collections.sort(countries, new Comparator());

        System.out.println(String.join(", ", countries));

    }
}
