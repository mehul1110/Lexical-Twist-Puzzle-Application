# Lexical Twist Puzzle Application

A console-based Java application that processes two words and applies logical transformations based on reverse matching and vowel–consonant distribution rules.  
The system evolves progressively through structured use cases, demonstrating refactoring discipline and OOP-based modular architecture.

---

## Use Cases

### UC1 – Display Puzzle Title  
Prints the static application title when the program starts.

### UC2 – Accept Word Inputs  
Accepts two words from the user through console input.

### UC3 – Validate Single Word Constraint  
Ensures that each input contains only one valid alphabetic word.

### UC4 – Check Reverse Relationship  
Determines whether the second word is the reverse of the first (case-insensitive).

### UC5 – Transform Word if Reverse Match  
Reverses the word, converts it to lowercase, and replaces all vowels with '@' when a reverse match occurs.

### UC6 – Combine Words if Not Reverse  
Combines both words, converts them to uppercase, and counts vowels and consonants.

### UC7 – Rule-Based Output Handling  
Displays the first two unique vowels or consonants based on distribution rules, or prints equality if counts match.

### UC8 – Fully Modular OOPS Architecture  
Refactors the system into separate classes for validation, analysis, and user interaction following OOP principles.
