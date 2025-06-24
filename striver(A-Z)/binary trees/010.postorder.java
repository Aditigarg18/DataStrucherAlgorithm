//leetcode145

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        help(root,ans);
        return ans;
    }
    public void help(TreeNode root,List<Integer>ans){
        if(root==null){
            return;
        }
        help(root.left,ans);
        help(root.right,ans);
        ans.add(root.val);
    }
}
