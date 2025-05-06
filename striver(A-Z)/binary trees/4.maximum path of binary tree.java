//leetcode 124
// A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
//   A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

// The path sum of a path is the sum of the node's values in the path.

// Given the root of a binary tree, return the maximum path sum of any non-empty path.
// Input: root = [1,2,3]
// Output: 6
// Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

class Solution {
    public int maxPathSum(TreeNode root) {
        int maxvalue[]=new int[1];
        maxvalue[0]=Integer.MIN_VALUE;
        maxpathdown(root,maxvalue);
        return maxvalue[0];
    }
    private int maxpathdown(TreeNode node,int maxvalue[]){
        if(node==null)return 0;
        int left=Math.max(0,maxpathdown(node.left,maxvalue));
        int right=Math.max(0,maxpathdown(node.right,maxvalue));
        maxvalue[0]=Math.max(maxvalue[0],left+right+node.val);
        return Math.max(left,right)+node.val;
    }
}
