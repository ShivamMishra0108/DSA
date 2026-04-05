package BinaryTrees;

class EvaluateBooleanBT {
    public boolean evaluateTree(Node root) {

        // If leaf node
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        // Evaluate left and right subtree first
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        // If OR node
        if (root.val == 2) {
            return left || right;
        }
        // If AND node
        else { // root.val == 3
            return left && right;
        }
    }
}
