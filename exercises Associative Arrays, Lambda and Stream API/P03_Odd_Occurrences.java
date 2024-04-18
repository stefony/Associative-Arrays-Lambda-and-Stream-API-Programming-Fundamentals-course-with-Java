package associativeArreyExercise_OK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Odd_Occurrences {
    public static void main(String[] args) {
        // Read a line of words
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // Split the line into words
        String[] words = line.split(" ");

        // Create a map to count occurrences of each word (case-insensitive)
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            wordCount.put(lowerCaseWord, wordCount.getOrDefault(lowerCaseWord, 0) + 1);
        }

        // Create a string to store the result
        StringBuilder result = new StringBuilder();

        // Append words with odd occurrences to the result
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(entry.getKey());
            }
        }

        // Print the result
        System.out.println(result.toString());

    }
}
