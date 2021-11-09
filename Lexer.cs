using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KraitScript
{

        // Scan the text in from the source file
        public class Scanner
        {
                int numLines;
                List<string> file;
                int line;
                public static Scanner()
                {
                        file = new list<string>();
                }
                public void readFile(string fileName)
                {
                        file = System.IO.ReadAllLines(fileName);
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

                public class Token
                {
                        TokenType tokenType;
                        public Token(TokenType assign)
                        {
                                tokenType = assign;
                        }

                }

                List<keyWords> readTokens;
                Token currentToken { get; }
                Token previousToken { get; }
                Scanner fileScanner;

                string FileName {get; set;}

                int currTokenIndex;
                public Lexer()
                {
                        readTokens = new List<keyWords>();
                        fileScanner = new Scanner();
                }

                public bool generateTokens()
                {
                        if (!FileName.Contains(".ks")) {
                                Console.WriteLine("ERROR:\nFile isn't of type '.ks'");
                                return false;
                        }
                        
                        while ()
                        {

                        }

                        return true;
                }

                public consumeToken()
                {

                        currentToken = readTokens[currTokenIndex++];
                }
        }

}
