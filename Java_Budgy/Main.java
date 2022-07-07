import java.io.*;
import java.util.*;

/**
 * The Main program execution loop.
 * Pieces and runs all the components of the compiler together.
 */
public class Main {
    /**
     * Main method
     * @param args commandline arguments indexing from 0 (post program name)
     */
    public static void main(String args[]) {
        Lexer lexer;
        // Check for valid input source (terminal/console or file with proper extension)
        // NOTE: Only one file is to be provided as an argument for the monarch compiler to compile it and the dependencies.
        switch (args.length) {
            case 1:
                // Check if the file is of .king suffix. 
                if (!args[0].endsWith(".kcpp")) {
                    System.out.println("The file supplied does not have a '.kcpp' suffix.\nEnding compilation\n\n");
                    System.exit(-1);
                }
                else {
                    try {
                        File source_file = new File(args[0]);
                        lexer = new Lexer(source_file);
                        // Lex the file into readable tokens
                        lexer.readLines();
                        
                        // Compiler will reconstruct the AST into a linear list for outputting Java source code
                        // Envoke the appropriate command-line command to compile outputted Java source code into a .class file
                        // Envoke the appropriate command-line command to compile to a .jar file.
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            default:
                System.out.println("Zero or more than one argument(s) were provided\n\n");
                System.exit(-1);
        }
    }
}