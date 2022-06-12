public class Node {
    public Long srcLineNumber; 
    public String name;
    public String contents;
    
    public Node leftChild;
    public Node rightChild;

    public Node(Long srcLineNumber, String name, String contents) {
        this.srcLineNumber = srcLineNumber;
        this. name = name;
        this.contents = contents;
    }

    public Node(Long srcLineNumber, String name, String contents, Node leftChild, Node rightChild) {
        this.srcLineNumber = srcLineNumber;
        this.name = name;
        this.contents = contents;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String toString() {
        return String.format("Node %s:\n\tSource code Line Number: %s\n\tContents for codegen: %s\n\tLeft Child Node: %s\n\t Right Child Node: %s\n\n", name, srcLineNumber, contents, leftChild, rightChild);
    }
}