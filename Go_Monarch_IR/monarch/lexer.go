package monarch

import (
	"fmt"
	"os"
	"strings"
)

var print = fmt.Println;
var input = fmt.Scanln;

// Implementing Enum "TokenType" 
type TokenType int64;

const (
	Unsupported TokenType = iota
	If
	Else
	For
	While
	Async
	New
	Free
	EOF

)

// Must make fields start with a capital letter to access the fields in outside of package
type Token struct {
	token_type 		TokenType
	token_string 	string
	token_value 	any

}

type Lexer struct {
	current_line 	int64
	current_token 	Token
	next_token 		Token
}

func New_Lexer() *Lexer {
	new_lexer := Lexer{};
	return &new_lexer;
}

func (lexer Lexer) Get_Current_Line() int64 {
	return lexer.current_line;
}

func (lexer Lexer) Get_Current_Token() Token {
	return lexer.current_token;
}

func (lexer Lexer) Get_Next_Token() Token {
	return lexer.next_token;
}

func Scan(input_file string) string {
	// Check to see if the name of the file contains the .king file-extension
	// Probably want to change this to .mon in the future.
	// Also, this doesn't do anything except check if the string provided has a .king in it.
	// Not very useful atm but will be altered to be later on.
	if (!strings.Contains(input_file, ".king")) {
		// We then need to return as this isn't the appropriate file type
		print("\n\nInvalid file format provided to compiler.");
		print("Please ensure that the file format is of type '.king'\n");
		print("Quitting Program...\n");
		os.Exit(1);
	}

	return "Successfully Lexed Input";
}