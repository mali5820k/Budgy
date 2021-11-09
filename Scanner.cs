using System;
using System.Collections;
using System.Text;
using System.Threading.Tasks;

namespace KraitScript {

	public class Scanner
	{
		int numLines;
                List<string> file;
                int line;
                public Scanner() {
                        file = new list<string>();
                }
		public void readFile(string fileName) {
                        file = System.IO.ReadAllLines(fileName);
		}
		public string getNextLine() {
			return file.get(line);
		}
	}
}
