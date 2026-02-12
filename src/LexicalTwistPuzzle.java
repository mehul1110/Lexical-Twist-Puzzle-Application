import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // UC3 – Validation
        if (firstWord.contains(" ") || secondWord.contains(" ")) {
            System.out.println("Invalid word input");
            return;
        }

        // UC4 – Reverse Check
        String reversed = new StringBuilder(firstWord)
                .reverse()
                .toString();

        if (reversed.equalsIgnoreCase(secondWord)) {

            // UC5 – Transform if Reverse Match
            String transformed = reversed
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            // UC6 – Combine and Count
            String combined = (firstWord + secondWord).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            for (char c : combined.toCharArray()) {

                if ("AEIOU".indexOf(c) != -1) {
                    vowels++;
                }
                else if (Character.isLetter(c)) {
                    consonants++;
                }
            }

            // UC7 – Rule-Based Output

            if (vowels > consonants) {

                Set<Character> uniqueVowels = new LinkedHashSet<>();

                for (char c : combined.toCharArray()) {
                    if ("AEIOU".indexOf(c) != -1) {
                        uniqueVowels.add(c);
                        if (uniqueVowels.size() == 2) {
                            break;
                        }
                    }
                }

                for (char c : uniqueVowels) {
                    System.out.print(c);
                }

            }
            else if (consonants > vowels) {

                Set<Character> uniqueConsonants = new LinkedHashSet<>();

                for (char c : combined.toCharArray()) {
                    if ("BCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1) {
                        uniqueConsonants.add(c);
                        if (uniqueConsonants.size() == 2) {
                            break;
                        }
                    }
                }

                for (char c : uniqueConsonants) {
                    System.out.print(c);
                }

            }
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
