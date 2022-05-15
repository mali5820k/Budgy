use std::fmt;

// Lexer
union Value {
    val_u8: u8,
    val_u16: u16,
    val_u32: u32,
    val_u64: u64,
    val_u128: u128,
    
    val_i8: i8,
    val_i16: i16,
    val_i32: i32,
    val_i64: i64,
    val_i128: i128,

    val_f32: f32,
    val_f64: f64,
}

// Each Token entry has a "Token Type" which each holds the associated data type and the line
// number that token appears on.
pub enum Token {
    Keyword(String, i128),
    Numeric(Value, i128),
    Operator(char, i128),
    Symbol(String, i128)
}

impl Token {
    pub fn get_value (&self) -> String{
        let mut my_string = String::from("{} {}", );
    }
}

impl fmt::Display for Token {
    pub fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result{
        write!(f, "({})", self::get_value);
    }
}

pub struct Scanner {
    current_line: i128,
    line_buffer: String,
}

pub struct Lexer {
    tokens_list: Vec<Token>,
    current_token: Token,


}

impl Lexer {
    pub fn new (&mut self) -> Self {
        let instance = Lexer {

        };

        instance
    }

    pub fn set_current_line (&mut self, i:i64) -> bool {
        return true;
    }

    pub fn get_current_line (&self) -> i64 {
        return 1;
    }
}

impl fmt::Display for Lexer {
    pub fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result{
        write!(f, "({})", self.current_token);
    }
}