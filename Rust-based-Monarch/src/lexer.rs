// Lexer
enum DataType {
    Int, Int8, Int16, Int32, Int64, Int128,
    Float, Double, Str, Chr, Obj,
}

pub enum Token {
    // NOTE, the order of these tokentypes aren't an accurate 
    // indication of their precedence. That will be handled by the parser.

    /* Scope and precedence: */
    LBrack, RBrack, LParen, RParen,

    /* Other Special characters */
    BackSlash, Tilde, Dot, 
    Colon, SemiColon,

    /* Comparison operators */
    Eq, GrEq, LsEq, EqEq, Gr, Ls, NEq,

    /* Logical operators */
    And, Or, Not, Bang, BitAnd, BitOr, BitXor,

    /* Expression operators */
    MultEq, DivEq, AddEq, SubEq,
    Mult, Div, Add, Sub,
    AddPost, SubPost, Exp, // Exp is ^^ which raises the base to that power, for example: 

    /* Keywords */
    For, While, Continue, Break,
    If, Else,
    Switch, Case, Default,
    Class, Struct, Var,

    /* Variable types */
    Int, Float, Double, Str, Chr,
    Int8, Int16, Int32, Int64, Int128,

    /* Data Structures */
    FixedList, List, HashMap, 
}

    int16: i16,
// Stores one contiguous string of tokens on the same line : ie: var x = 10;
// or multiline: while (1) {
//                  var x = 10;   
//               }
// However, each Token
struct TokenObj {
    start_line_number: i64,
    end_line_number: i64,
    tokens: Vec<Token>
}

// In order to utilize this struct in the parser.rs file
pub struct Lexer {
    pub currentLine: i64, //  Could get away with just an i32
    pub currentToken: Token,
    pub nextToken: Token,
}
impl Lexer {
    pub fn set_current_line(&mut self, i:i64) -> bool {
        self.currentLine = i;
        return true;
    }

    pub fn get_current_line(&self) -> i64 {
        return self.currentLine;
    }
}