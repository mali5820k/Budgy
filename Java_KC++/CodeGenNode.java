import java.util.ArrayList;

public class Node {
    Long srcLineNumber; 
    String name;
    String contents;

    Node leftChild;
    Node rightChild;

    public Node() {}

    public Node(Long srcLineNumber, String name, String contents, Node leftChild, Node rightChild) {
        this.srcLineNumber
    }
}

public class CodeGenNode {

    ArrayList<Node> nodes;

    public CodeGenNode() {
        nodes = new ArrayList<>();
    }

    public void createNewNode(String name, String contents) {
        nodes.add(new Node());
    }
}
