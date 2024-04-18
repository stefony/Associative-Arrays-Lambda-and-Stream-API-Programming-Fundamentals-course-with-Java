package associativeArreyExercise_OK;

import java.util.Scanner;

public class P04_Word_Filter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt for and read a line of space-separated words
       String line = scanner.nextLine();

        // Split the line into words
        String[] words = line.split(" ");

        // Check each word's length and print if it's even
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
