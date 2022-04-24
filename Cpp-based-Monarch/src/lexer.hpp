#include <cstdint>

#ifndef lexer_hpp
#define lexer_hpp
enum Token_Identifier {
    If,
    Else,
    Var,
    List,
    Dict,
    Int8, Int16, Int32, Int64,
    Uint8, Uint16, Uint32, Uint64,
    Float32, Float64,
    Char, String, Byte, 
    For, While,
    Func,
    Bit_Not, Not,
    Bit_And, And,
    Bit_Or, Or,
    Bit_Xor, Xor,
    Equals, Equals_Equals,
    Not_Equals,
    Plus_Equals, Plus,
    Minus_Equals, Minus,
    Times_Equals, Times,
    Divide_Equals, Divide,
    Exponentiate, Exponentiate_Equals,
    Post_Plus, Post_Minus,
    Post_Times, Post_Divide,
    Comment_Single, Comment_Multi_Start, Comment_Multi_End,
    Dot, Class, Semicolon, Colon,
    Left_Paren, Right_Paren,
    Left_Square_Bracket, Right_Square_Bracket,
    Left_Curly_Bracket, Right_Curly_Bracket,
    Eof, Tab, Space, Newline, Double_Quote, Single_Quote,

};

enum Token_Type {
    Numeric, // Numbers, bytes, ints, and floats
    Primitive, // Such as arrays/lists
    Object, // Structs and Classes
    Identifier, // For Variable and Function names
    Keyword, // Language Keywords and reserved characters
};

typedef struct Token {
    Token_Identifier token_name;
    Token_Type token_type;
    int64_t line_number;
    
    union Token_Value {
        double numeric_value;
        std::string string_value;
    };
    
} Token;

class Lexer {
    public:
    Lexer(); // Constructor
    ~Lexer(); // Destructor

    
    Token get_next_token();
    Token look_ahead_one_token();

    private:
    Token current_token;
    Token previous_token;
    int64_t current_line;
};

#endif