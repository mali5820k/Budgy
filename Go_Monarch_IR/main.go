package main

import (
	"fmt"
	"./lexer"
	"./parser"
)

func main() {
	fmt.Println("Hello World");
	var x = parse();
	fmt.Println(x);
	fmt.Println(lexer());
}