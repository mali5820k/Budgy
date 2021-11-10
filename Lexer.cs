using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KraitScript
{

        // Scan the text in from the source file
        public class CodeScanner
        {
                int numLines;
                List<string> file;
                int line;
                public CodeScanner()
                {
                        file = new list<string>();
                }
                public void ReadFile(string fileName)
                {
                        // Dropping this in favor of File methods
                        //file = System.IO.ReadAllLines(fileName);
                        if (!File.Exists(fileName))
                        {
                                file.Concat((File.ReadAllLines(fileName)).ToList<string>());
                        }
                }
        }

        public class Lexer
        {
                enum TokenType
                {
                        // Keywords
                        VAR, FOR, WHILE, FUNC, PRINT, INT, FLOAT, STRING, CHAR,
                        DOUBLE, LONG, BYTE, BIT, CLASS, OBJECT, RETURN,
                        CONTINUE, BREAK, MAIN,

                        // Operators:
                        PLUS, PLUS_EQUAL, POST_PLUS_PLUS, PRE_PLUS_PLUS,

                        MINUS, MINUS_EQUAL, POST_MINUS_MINUS,
                        PRE_MINUS_MINUS, MULT, MULT_EQUAL, DIV, DIV_EQUAL,

                        EQUAL_ASSIGN, EQUAL_EQUAL, GREATER_THAN, LESS_THAN,
                        GREATER_THAN_EQUAL, LESS_THAN_EQUAL,

                        LOGICAL_NOT, LOGICAL_OR, LOGICAL_AND,
                        BITWISE_NOT, BITWISE_OR, BITWISE_AND,
                        BITWISE_NAND, BITWISE_XOR,
                        BITWISE_ONES_COMPLEMENT, BITWISE_TWOS_COMPLEMENT
                }


                List<Token> readTokens;
                Token currentToken { get; }
                Token previousToken { get; }
                CodeScanner fileScanner;

                string FileName { get; set; }

                int currTokenIndex;
                public Lexer()
                {
                        readTokens = new List<keyWords>();
                        fileScanner = new CodeScanner();
                }

                public bool generateTokens()
                {
                        fileScanner.ReadFile(FileName);

                        foreach (string line in lines)
                        {
                                // Divide the string without the white-spaces
                                // Check each word scanned in to see what 
                        }

                        return true;
                }

                public void consumeToken()
                {
                        currentToken = readTokens[currTokenIndex++];
                }
        }

}
