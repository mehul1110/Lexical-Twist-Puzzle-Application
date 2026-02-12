import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        printHeader();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        if (!WordValidator.isValid(firstWord) ||
                !WordValidator.isValid(secondWord)) {

            System.out.println("Invalid word input.");
            return;
        }

        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        String result = analyzer.analyze(firstWord, secondWord);

        printResult(result);
    }

    private static void printHeader() {
        System.out.println("=================================");
        System.out.println("        Lexical Twist Puzzle      ");
        System.out.println("=================================");
    }

    private static void printResult(String result) {
        System.out.println("\n--- Puzzle Result ---");
        System.out.println(result);
    }
}
