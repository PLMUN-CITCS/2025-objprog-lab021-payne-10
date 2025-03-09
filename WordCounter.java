import java.util.Scanner;

public class WordCounter {
    
    // Method to get sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }
    
    // Method to count words in the given sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+"); // Split by whitespace
        return words.length;
    }
    
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get user input
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence has " + wordCount + " words.");
    }
}