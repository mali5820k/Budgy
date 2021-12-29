#ifndef ks_lexer_h
#define ks_lexer_h
#include <cstdint>

enum TokenType {
    // Variable Types
    BYTE, BIT,
    INT8, INT16, INT32, INT64,
    UINT8, UINT16, UINT32, UINT64,
    FLOAT, DOUBLE, STRING, CHAR, 

    // Keywords
    VAR, FOR, WHILE, FUNCTION, PRINT, 
    STRUCT, CLASS, OBJECT, RETURN,
    CONTINUE, BREAK, MAIN,

    // Operators:
    PLUS, PLUS_EQUAL, POST_PLUS_PLUS, PRE_PLUS_PLUS,

    MINUS, MINUS_EQUAL, POST_MINUS_MINUS,
    PRE_MINUS_MINUS, MULT, MULT_EQUAL, DIV, DIV_EQUAL,

    EQUAL_ASSIGN, EQUAL_EQUAL, GREATER_THAN, LESS_THAN,
    GREATER_THAN_EQUAL, LESS_THAN_EQUAL,

    LOGICAL_NOT, LOGICAL_OR, LOGICAL_AND,
    BITWISE_NOT, BITWISE_OR, BITWISE_AND,
    BITWISE_NAND, BITWISE_XOR,
    BITWISE_ONES_COMPLEMENT, BITWISE_TWOS_COMPLEMENT

};

typedef struct Token {
    TokenType type;

    // Anonymous Union allows direct variable access from struct
    union {
        // Values
        uint8_t uint8;
        uint16_t uint16;
        uint32_t uint32;
        uint64_t uint64;

        int8_t int8;
        int16_t int16;
        int32_t int32;
        int64_t int64;

        float float_;
        double double_;
    };
} Token;

class Lexer {

    public:
    Token currentToken;
    Token nextToken;
    Token prevToken; // Don't know if we need this one.
};

#endif