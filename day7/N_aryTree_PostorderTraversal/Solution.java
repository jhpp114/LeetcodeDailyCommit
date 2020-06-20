import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> solution = new ArrayList<Integer>();
        postorder(root, solution);
        return solution;
    }
    
    public void postorder(Node root, List<Integer> sol) {
        if (root != null) {
            for (Node _node : node.children) {
                postorder(_node, sol);
            }
            sol.add(_node.val);
        }
    }
}