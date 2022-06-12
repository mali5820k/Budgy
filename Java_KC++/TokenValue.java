public class TokenValue <T> {
    public T value;

    public TokenValue (T value) {
        this.value = value;
    }
    
    public String toString() {
        return value.toString();
    }
}
