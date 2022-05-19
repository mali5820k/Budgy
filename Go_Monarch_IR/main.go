package main

import (
	"fmt"
	."local_imports/monarch"
	"os"
)

var print = fmt.Println;
var input = fmt.Scanln;
var lexer = New_Lexer();
var user_input = "";

func main() {
	print("Starting Monarch Compiler...");
	print("Creating new lexer...");
	print("Lexer's current line: ", lexer.Get_Current_Line());
	print("Please provide a file to start compiling expressions from:");
	input(&user_input);
	scanner_message := Scan(user_input);
	print(scanner_message);
	print("Quitting Program...")
	//print("Creating Parser...");
	os.Exit(0);
}
