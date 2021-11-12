using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KraitScript {

	public class Compiler {

		public static void Main(string[] args) {
			Console.WriteLine("New Project Compiler");
                        Console.WriteLine("Current args and argLength {0}", args[0]);
                        if(args.Length < 1) {
                                Console.WriteLine("Usage: ./KSCompiler sourceFile.ks");
                                //Application.Exit(); // This apparently doesn't work on linux
                                Environment.Exit(-1);
                        }
                        Lexer lex = new Lexer();
                        lex.ReadFile(args[0]);
                        Console.WriteLine(lex.generateTokens());
		}
 
		public bool generateIL() {
			// Placeholder
                        return true;
		}
	}
	
}
