
struct ASTNode {
    nodeLeft: ASTNode,
    nodeRight: ASTNode,
}

struct Parser {
    lexer: Lexer,
    currentNode: ASTNode,
    prevNode: ASTNode,
    error: bool,
}

// Methods in rust use an implementation block
impl Parser {

    fn parse_whiteSpace(&self) -> Parser {
        if (self.currentNode)
    }
}