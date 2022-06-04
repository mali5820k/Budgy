import java.io.*;
import java.util.*;

/**
 * The Main program execution loop.
 * Pieces and runs all the components of the compiler together.
 */
public class Main {

    /**
     * Wrapper function to simplify println call.
     * @param string String input to Println call.
     */
    public static void println(String string) {
        System.out.println(string);
    }

    /**
     * Main method
     * @param args commandline arguments indexing from 0 (post program name)
     */
    public static void main(String args[]) {
        // Check for valid input source (terminal/console or file with proper extension)
        if (args.length != 1) {
            System.out.println("No arguments were provided");
        }
        // Lex the file into readable tokens
        Lexer lexer = new Lexer();
        // Parser will generate an AST from the assembled list of tokens
        // Compiler will reconstruct the AST into a linear list for outputting Java source code
        // Envoke the appropriate command-line command to compile outputted Java source code into a .class file
        // Envoke the appropriate command-line command to compile to a .jar file.

    }
}