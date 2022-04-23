use crate::lexer;

struct ASTNode {
    contents: String
}

struct ASTJunction {
    nodeLeft: Box<ASTJunction>,
    currentNode: ASTNode,
    nodeRight: Box<ASTJunction>,
}

struct Parser {
    lexer_: lexer::Lexer,
    currentNode: ASTNode,
    prevNode: ASTNode,
    error: bool,
}

// Methods in rust use an implementation block
impl Parser {

    fn parse_whiteSpace(&self) {
        
    }
}