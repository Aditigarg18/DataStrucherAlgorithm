
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
    if (root == null) return false;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int size = queue.size();
        boolean xFound = false, yFound = false;

        for (int i = 0; i < size; i++) {
            TreeNode current = queue.poll();

            // Check if x and y are children of the same parent
            if (current.left != null && current.right != null) {
                if ((current.left.val == x && current.right.val == y) ||
                    (current.left.val == y && current.right.val == x)) {
                    return false; // Same parent
                }
            }

            if (current.val == x) xFound = true;
            if (current.val == y) yFound = true;

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        if (xFound && yFound) return true;
        if (xFound || yFound) return false;
    }

    return false;
}

    }
