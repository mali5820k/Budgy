import java.io.*;
import java.util.*;

import javax.sql.rowset.CachedRowSet;

/**
 * The Lexer class implementation.
 * Scans in an input source and splits up the string input as 
 * identifiable tokens.
 */
public class Lexer {
    File srcFile;
    Long currentLineNumber;
    String currentLine;
    String currentChar;
    int srcLineNumber;
    Token prevToken, curToken;
    ArrayList<Token> tokens;

    public Lexer() {
        tokens = new ArrayList<>();
    }

    /**
     * Sets the source file path from the provide path. 
     * IMPLICIT: checks if file path is valid or not.
     * 
     * @param srcFile File, the path to the source file.
     * @returns void
     */
    public void setSrcFile(File srcFile) {
        try {
            // Check if file exists:
            if (!srcFile.exists()) {
                // If doesn't exist, return an error and quit
                System.out.println("ERROR: Source file doesn't exist: " + srcFile.toString() + " \n\nExiting program...\n\n");
                System.exit(-1);
            } else {
                this.srcFile = srcFile;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCurrentLine() {
        return currentLine;
    }

    public String getCurrentChar() {
        return currentChar;
    }

    public void setSrcLineNumber(int srcLineNumber) {
        this.srcLineNumber = srcLineNumber;
    }

    public TokenValue<?> isNumeric(String word) {
        Character end = word.charAt(word.length() -1);
        if (end.equals('f')) {
            // Type is float
            float val = Float.parseFloat(word);
            return new TokenValue<Float>(val);
        }
        else if (end.equals('d') || word.contains(".")) {
            // Type is double
            double val = Double.parseDouble(word);
            return new TokenValue<Double>(val);
        }
        else {
            try {
                // Type is Integer
                int val1 = Integer.parseInt(word);
                return new TokenValue<Integer>(val1);
            }
            catch (Exception e) {
                try {
                    // Type is Long
                    long val2 = Long.parseLong(word);
                    return new TokenValue<Long>(val2);
                }
                catch (Exception e2) {
                    // This datatype is too large!
                    System.out.println("Data value is larger than 64-bits! DUMP!");
                    e2.printStackTrace();
                }
            }

        }
        return new TokenValue<String>("Test_Value");
    }

    public void Tokenize(String currentLine) {
        String words[] = currentLine.split(" "); // Split at whitespaces
        for (int i = 0; i < words.length; i++) {
            switch (words[i]) {
                // Check for key-words
                case "import":
                    TokenValue<String> keyword = new TokenValue("import");
                    Token<String> newToken = new Token(TokenType.IMPORT, keyword, currentLineNumber);
                    tokens.add(newToken);
                    break;
                case "func": // Function declaration keyword
                    break;
                case "class":
                    break;
                case "public":
                    break;
                case "private":
                    break;
                case "fixed": // Allocated on the stack (Prefix to data-structure or type)
                    break;
                case "var":
                    break;
                // Control-flow
                case "if":
                    break;
                case "else":
                    break;
                case "for":
                    break;
                case "foreach":
                    break;
                case "while":
                    break;
                case "break":
                    break;
                case "continue":
                    break;
                case "return":
                    break;

                // Operators:
                case "+":  // Addition
                    break;
                case "-":  // Subtraction
                    break;
                case "*":  // Multiplication
                    break;
                case "/":  // Division
                    break;
                case "++": // Post-increment
                    break;
                case "--": // Post-decrement
                    break;
                case "//": // Single-line comment
                    break;
                case "**": // Post-Square
                    break;
                case "^^": // Exponential operator
                    break;
                case "|":  // Bitwise OR
                    break;
                case "||": // Logical OR
                    break;
                case "&":  // Bitwise AND
                    break;
                case "&&": // Logical AND
                    break;
                case "~":  // Bitwise NOT
                    break;
                case "!":  // Logical NOT
                    break;
                default:   // Value
                    // Check if the value is a Numeric type:
                    if (Character)
                    break;
            }
        }
    }

    public void readLines() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(srcFile); // Reads the srcFile line-by-line.
        while (fileScanner.hasNextLine()) {
            currentLine = fileScanner.nextLine(); // Get the next line from the src file.
            // FOR DEBUG VIEW ONLY:
            System.out.println("Line that was read from the Lexer:\n " + currentLine + "\n\n");
            Tokenize(currentLine);
        }
        fileScanner.close();
        
    }
}
