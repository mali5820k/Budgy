using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KraitScript {

	public class Compiler {

		public static void Main(string[] args) {
			Console.Writeline("New Project Compiler");
                        if(args.Length < 2) {
                                Console.WriteLine("Usage: ./KSCompiler sourceFile.ks");
                                //Application.Exit(); // This apparently doesn't work on linux
                                Environment.Exit(-1);
                        }
		}
 
		public bool generateIL() {
			// Placeholder
		}
	}
	
}
