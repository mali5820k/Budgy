use std::fmt;

// Lexer
enum DataType {
    Int, Int8, Int16, Int32, Int64, Int128,
    Float, Double, Str, Chr, Obj,
}

pub enum TokenDeprecated {
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

/*
 * Token Enum (Behaves like a union).
 *
 * Variable stores the name of the variable in context.
 * Function stores the name of the function whether in declaration or a function call.
 * Keyword is the keyword reserved for the language encountered in the particular line,
 *      such as if, else, while, for, continue, break, return, null, var, class,
 *      constructor, and etc..
 * Numeric is a numberic value encountered, such as int, float, double, or byte.
 * Operator stores the operation taking place, such as assignment '=', multiplication
 * '*', addition, subtraction, division, exponentiation '^^', and more.
 */

pub enum TokenType {
    Var(String),
    Func(String),
    Keyword(String),
    Numeric(String),
    Operator(String),
}

impl fmt::Display for TokenType {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        match self {
            TokenType::Var(value) => write!(f, "TokenType: Var\n\tTokenString: {}", value),
            TokenType::Func(value) => write!(f, "TokenType: Func\n\tTokenString: {}", value),
            TokenType::Keyword(value) => write!(f, "TokenType: Keyword\n\tTokenString: {}", value),
            TokenType::Numeric(value) => write!(f, "TokenType: Numeric\n\tTokenString: {}", value),
            TokenType::Operator(value) => write!(f, "TokenType: Operator\n\tTokenString: {}", value),
        }
    }
}

struct TokenObj {
    token_type: TokenType,
    line_number: i64,
}

impl fmt::Display for TokenObj {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Token Type: {}\nOn Line: {}", self.token_type, self.line_number) 
    }
}

pub struct Lexer {
    pub current_token: TokenType,
    pub next_token: TokenType,
    pub current_line: i64,
}

impl Lexer {
    pub fn set_current_line(&mut self, i:i64) -> bool {
        self.current_line = i;
        return true;
    }

    pub fn get_current_line(&self) -> i64 {
        return self.current_line;
    }
}

impl fmt::Display for Lexer {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Lexer:\nCurrent Token: {}\nNext Token: {}\nCurrent Line: {}", self.current_token, self.next_token, self.current_line)
    }
}
