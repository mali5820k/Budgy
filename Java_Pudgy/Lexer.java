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
    ArrayList<Char> lineBuffer; // Characters within the current line
    ArrayList<Token> tokens; // Collection of tokens generated from this file
    ArrayList<Char> accumulatedCharacters; // The characters accumulated for the current word

    public Lexer() {
        if (srcFile == null) {
            srcFile = null;
        }
        currentLineNumber = 0;
        lineBuffer = new ArrayList<>();
        tokens = new ArrayList<>();
        tokens = new ArrayList<>();
    }

    public Lexer(File srcFile) {
        Lexer();
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
            currentLine = fileScanner.nextLine(); // Get the next line from the src file.
            // FOR DEBUG VIEW ONLY:
            System.out.println("Line that was read from the Lexer:\n " + currentLine + "\n\n");
            Tokenize(currentLine);
        }
        fileScanner.close();
        
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
                }
            }

        }
        return new TokenValue("Test_Value");
    }


}
