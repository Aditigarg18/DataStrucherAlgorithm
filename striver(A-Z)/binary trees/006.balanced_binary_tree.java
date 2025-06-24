//leetcode 110
class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root)!=-1;
    }
    int dfsheight(TreeNode root){
        if (root==null)return 0;
        int leftheight=dfsheight(root.left);
        if(leftheight==-1)return -1;
        int rightheight=dfsheight(root.right);
        if(rightheight==-1)return -1;
        if(Math.abs(leftheight-rightheight)>1)return -1;
        return Math.max(leftheight,rightheight)+1;
    }
}
