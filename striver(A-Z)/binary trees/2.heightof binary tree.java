//leetcode 104
// Given the root of a binary tree, return its maximum depth.

// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//   Input: root = [3,9,20,null,null,15,7]
// Output: 3
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null )return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
}
