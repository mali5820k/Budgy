import java.util.ArrayList;

public class CodeGenNode {

    ArrayList<Node> nodes;

    public CodeGenNode() {
        nodes = new ArrayList<>();
    }

    public void createNewNode(Long srcLineNumber, String name, String contents) {
        nodes.add(new Node(srcLineNumber, name, contents));
    }
}
