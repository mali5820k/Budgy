import java.util.*;

public class Token {
    public enum TokenType{
        IF, ELSE, THIS, FOR, WHILE,
        VAR, FUNCTION, CLASS, STRUCT, ENUM,
        LIST, DICT,
        INT8, INT16, INT32, INT64,
        // UINT8, UINT16, UINT32, UINT64, // Don't need unsigned integers
        FLOAT, DOUBLE,
        BYTE, CHAR, STRING,
        IMPORT, SINGLE_COMMENT, MULTI_COMMENT, DOC_COMMENT,
        EOF, NEWLINE, 
        LEFT_PAREN, RIGHT_PAREN, LEFT_CURLY_BRACE, RIGHT_CURLY_BRACE, LEFT_SQUARE_BRACKET, RIGHT_SQUARE_BRACKET,
        SEMI_COLON, COLON, SINGLE_QUOTE, DOUBLE_QUOTE, 
        OPERATOR; 
    }

    public TokenType type;
    public TokenValue value;

    public String toString() {
        return String.format("Token:\n\tToken type: %s\n\tToken value: %s", type.toString(), value.toString());
    }
}
