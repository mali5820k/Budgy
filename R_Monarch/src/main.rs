mod lexer;
mod parser;

use lexer::*;
use parser::*;

fn main() {
   // Run Parser
    // Generate byte-code
    // compile byte-code to rust expressions
    // output rust code as seperate file
    let mut myLexer = Lexer{ current_line: 0, current_token: TokenType::Operator("+".to_string()), next_token: TokenType::Numeric("1".to_string())};
    myLexer.set_current_line(820);
    let x = myLexer.get_current_line();
    print!("{}", myLexer);
}
