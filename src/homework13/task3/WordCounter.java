package homework13.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple program for counting words in the text. The text is given from
 * static final String from class Text. Used trim() for trimming whitespaces
 * in the start and in the end. Then splitting text by regex 'non-word'.
 * The resulting list placed to HashMap with key es words from text and value
 * as count of these words in the text. Applying toLoverCase() for including
 * all case-independent words.
 *
 * @author Yaroslav Zvolinskiy
 * @version 0.0.1
 */
public class WordCounter {
    public static void main(String[] args) {
        String text = Text.text;
        System.out.println(text);

        List<String> list = List.of(text.trim().split("\\W+"));
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s.toLowerCase())) {
                map.put(s.toLowerCase(), map.get(s.toLowerCase()) + 1);
            } else {
                map.put(s.toLowerCase(), 1);
            }
        }
        System.out.println("─".repeat(120) + "\nКоличество повторений слов в тексте:\n");
        print(map);
    }

    /**
     * This method displays elements of Map in another view than provided in Maps toString().
     * For better understanding of result.
     *
     * @param map Map collection for displaying.
     */
    private static void print(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.printf("%s = %d \n", element.getKey(), element.getValue());
        }
    }
}
