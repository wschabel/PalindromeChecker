import java.util.Scanner;

public class PalindromeChecker {
    static void main (String[] args) {
        System.out.println("Enter a word.");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder cleanedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (Character.isLetterOrDigit(character)) {
                character = Character.toLowerCase(character);
                cleanedWord.append(character);
            }
        }
        System.out.println("Original text: " + word);
        System.out.println("Cleaned text: " + cleanedWord.toString());
        boolean isPalindrome = check(cleanedWord.toString());
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        };
    }

    public static boolean check(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("Reversed text: " + reversed);
        return reversed.equals(word);
    }
}
