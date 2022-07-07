import java.io.*;
import java.util.*;

/**
 * The Lexer class implementation.
 * Scans in an input source and splits up the string input as 
 * identifiable tokens.
 */
public class Lexer {
    // File reading variables:
    File srcFile; // Source file path
    int currentLineNumber; // Current line number in file
    ArrayList<Character> lineBuffer; // Characters within the current line
    ArrayList<Token> tokens; // Collection of tokens generated from this file
    ArrayList<Character> accumulatedCharacters; // The characters accumulated for the current word

    public Lexer() {
        if (srcFile == null) {
            srcFile = null;
        }
        currentLineNumber = 1;
        lineBuffer = new ArrayList<>();
        tokens = new ArrayList<>();
        tokens = new ArrayList<>();
    }

    public Lexer(File srcFile) {
        this();
        setSrcFile(srcFile);
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

    public void readLines() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(srcFile); // Reads the srcFile line-by-line.
        while (fileScanner.hasNextLine()) {
            String currentLine = fileScanner.nextLine(); // Get the next line from the src file.
            // FOR DEBUG VIEW ONLY:
            System.out.println("Line that was read from the Lexer:\n " + currentLine + "\n\n");
            Tokenize(currentLine);
            currentLineNumber++;
        }
        fileScanner.close();
    }

    public boolean matchPattern(int index, String remainingExpression) {
        for (int i = index+1; i < remainingExpression.length(); i++) {
            if (lineBuffer.get(i) != remainingExpression.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public void Tokenize(String currentLine) {
        for(char character : currentLine.toCharArray()) { // Add all characters of the current line into the lineBuffer
            lineBuffer.add(character);
        }

        for (int i = 0; i < lineBuffer.size(); i++) {
            char character = lineBuffer.get(i);
            Token newToken = null;
            switch (character) {
                case 'c':
                    if (matchPattern(i, "lass")) {
                        // TODO
                    }
                    else if (matchPattern(i, "har")) {
                        // TODO
                    }
                    else if (matchPattern(i, "ontinue")) {
                        // TODO
                    }
                    break;
                case 'd':
                    break;
                case 'e':
                    break;
                case 'f':
                    break;
                case 'i':
                    break;
                case 'v':
                    break;
                case 'w':
                    break;
                case ' ':
                    newToken = new Token(TokenType.WHITESPACE, " ", currentLineNumber);
                    break;
                case '\n':
                    newToken = new Token(TokenType.NEWLINE, "\n", currentLineNumber);
                    break;
                default: // This is a value, variable, or object name:
                    String value = "";
                    // TODO: Get the remainder of the string of characters up to the first white-space and find out the type of the token.
                    TokenType type = isNumeric(""+character); // Need to get the whole "string" of this string input up to the whitespace.
                    if (type == TokenType.NOT_NUMERIC) {
                        type = TokenType.CONSTANT;
                    }
                    newToken = new Token(type, value, currentLineNumber); // Create the new token
                    tokens.add(newToken); // Append this new token to the list of tokes we have.
                    break;
                
            }
            accumulatedCharacters.clear(); // Clear the 
        }
    }

    public TokenType isNumeric(String word) {
        Character end = word.charAt(word.length() -1);
        if (end.equals('f')) {
            // Type is float
            float val = Float.parseFloat(word);
            return TokenType.FLOAT;
        }
        else if (end.equals('d') || word.contains(".")) {
            // Type is double
            double val = Double.parseDouble(word);
            return TokenType.DOUBLE;
        }
        else {
            try {
                // Type is Integer
                int val1 = Integer.parseInt(word);
                return TokenType.INT32;
            }
            catch (Exception e) {
                try {
                    // Type is Long
                    long val2 = Long.parseLong(word);
                    return TokenType.INT64;
                }
                catch (Exception e2) {
                    // This datatype is too large!
                    System.out.println("Data value is larger than 64-bits! DUMP!");
                    e2.printStackTrace();
                    System.exit(-1);
                }
            }
        }
        return TokenType.NOT_NUMERIC;
    }


}
