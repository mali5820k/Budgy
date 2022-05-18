package main

import (
	"fmt"
	."local_imports/monarch"
)

func main() {
	fmt.Println("Hello World");
	//var x = monarch.Parse();
	var x = Parse();
	fmt.Println(x);
	fmt.Println(Lexer());
	//fmt.Println(monarch.Lexer());
}
