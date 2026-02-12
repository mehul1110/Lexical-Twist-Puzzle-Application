public class WordValidator {

    public static boolean isValid(String word) {

        if (word == null) {
            return false;
        }

        word = word.trim();

        if (word.isEmpty()) {
            return false;
        }

        if (word.contains(" ")) {
            return false;
        }

        return word.matches("[a-zA-Z]+");
    }
}
