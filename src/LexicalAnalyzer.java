import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalAnalyzer {

    public String analyze(String first, String second) {

        String reversed = reverse(first);

        if (reversed.equalsIgnoreCase(second)) {
            return transformReverseMatch(reversed);
        }

        return analyzeCombination(first, second);
    }

    private String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    private String transformReverseMatch(String reversed) {

        return reversed
                .toLowerCase()
                .replaceAll("[aeiou]", "@");
    }

    private String analyzeCombination(String first, String second) {

        String combined = (first + second).toUpperCase();

        int vowelCount = countVowels(combined);
        int consonantCount = countConsonants(combined);

        if (vowelCount > consonantCount) {
            return extractUnique(combined, "AEIOU");
        }

        if (consonantCount > vowelCount) {
            return extractUnique(combined, "BCDFGHJKLMNPQRSTVWXYZ");
        }

        return "Vowels and consonants are equal";
    }

    private int countVowels(String word) {

        int count = 0;

        for (char c : word.toCharArray()) {
            if ("AEIOU".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    private int countConsonants(String word) {

        int count = 0;

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c) &&
                    "AEIOU".indexOf(c) == -1) {
                count++;
            }
        }

        return count;
    }

    private String extractUnique(String word, String target) {

        Set<Character> unique = new LinkedHashSet<>();

        for (char c : word.toCharArray()) {

            if (target.indexOf(c) != -1) {
                unique.add(c);

                if (unique.size() == 2) {
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c : unique) {
            result.append(c);
        }

        return result.toString();
    }
}
