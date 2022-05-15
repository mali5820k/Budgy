mod lexer;
mod parser;

fn main() {
    // Run Parser
    // Generate byte-code
    // compile byte-code to rust expressions
    // output rust code as seperate file
    //let mut myLexer : lexer::Lexer = { lexer::Lexer {currentLine: 0, currentToken: lexer::Token::Add, nextToken: lexer::Token::Add }};
    //myLexer.currentLine = 24;
    //myLexer.set_current_line(820);
    //let x = myLexer.get_current_line();
    //print!("\nThe current line that was assigned to the lexer is: \n{}\n", x);

    let my_lexer = lexer::Lexer::new();
    println!("{}", my_lexer.to_string());
}