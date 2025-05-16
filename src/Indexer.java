import java.util.*;

public class Indexer {
    private final Map<String, List<Integer>> index = new HashMap<>();

    public void indexText(String text) {
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].toLowerCase().split("\\W+");
            for (String word : words) {
                index.computeIfAbsent(word, k -> new ArrayList<>()).add(i + 1);
            }
        }
    }

    public List<Integer> search(String term) {
        return index.getOrDefault(term.toLowerCase(), Collections.emptyList());
    }
}