//leetcode 144
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
       help(root,ans);
       return ans;
    }
    public void help(TreeNode root ,List<Integer>ans){
        if(root==null){
            return;
            }
        ans.add(root.val);
        help(root.left,ans);
        help(root.right,ans);
    }
 }
