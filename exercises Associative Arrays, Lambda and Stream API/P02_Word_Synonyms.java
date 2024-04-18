package associativeArreyExercise_OK;

import java.util.*;

public class P02_Word_Synonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Initialize the map using LinkedHashMap to maintain insertion order
        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            // Read the word
            String word = scanner.nextLine();

            // Read the synonym
            String synonym = scanner.nextLine();

            // Add the synonym to the map
            synonymsMap.putIfAbsent(word, new ArrayList<>());
            synonymsMap.get(word).add(synonym);
        }

        // Print all words with their synonyms
        for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}
