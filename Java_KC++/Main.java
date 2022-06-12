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
        // NOTE: Only one file is to be provided as an argument for the monarch compiler to compile it and the dependencies.
        switch (args.length) {
            case 1:
                // Check if the file is of .king suffix. 
                if (!args[0].endsWith(".kc++")) {
                    System.out.println("The file supplied does not have a '.kcpp' suffix.\nEnding compilation\n\n");
                    System.exit(-1);
                }
                else {
                    try {
                        File source_file = new File(args[0]);
                        if (!source_file.exists()) {
                            System.out.println("The source file provided cannot be found on specific path. Please check the absolute path and try again.\n");
                            System.exit(-1);
                        }
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    

                }
                break;
            default:
                System.out.println("Zero or more than one argument(s) were provided\nEntering in Interpreter Mode (Coming soon...)\n\n");
                System.exit(-1);
        }

        // Lex the file into readable tokens
        Lexer lexer = new Lexer();
        // Parser will generate an AST from the assembled list of tokens
        // Compiler will reconstruct the AST into a linear list for outputting Java source code
        // Envoke the appropriate command-line command to compile outputted Java source code into a .class file
        // Envoke the appropriate command-line command to compile to a .jar file.

    }
}