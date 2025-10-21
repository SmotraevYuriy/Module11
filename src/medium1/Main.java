package medium1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String text = "Идут три брата: брат Клим брит, брат Глеб брит, брат Игнат бородат.";
        String[] words = text.split("[ :;,.]");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();

            if (!word.isEmpty()) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " [" + entry.getValue() + "]");
        }

    }
}
