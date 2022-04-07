// Lexer
enum TokenType {
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

union TokenValue {
    int8: i8,
    int16: i16,
    int32: i32,
    int64: i64,
    int128: i128,
    float32: f32,
    float64: f64,
    character: Chr,
    string: Str,
}

struct Token {
    tokenType: TokenType,
    tokenValue: TokenValue
}

struct Lexer {
    currentLine: i64, //  Could get away with just an i32
    currentToken: Token,
    nextToken: Token,
}