import java.util.*;

public class Token {

    public int lineNumber;
    public TokenType type;
    public String value;

    public Token (TokenType type, String value, int lineNumber) {
        this.type = type;
        this.value = value;
        this.lineNumber = lineNumber;
    }

    public String toString() {
        return String.format("Token:\n\tType: %s\n\tValue: %s", type.toString(), value.toString());
    }
}
