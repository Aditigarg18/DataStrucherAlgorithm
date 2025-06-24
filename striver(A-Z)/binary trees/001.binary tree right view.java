//leetcode 199
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

// Example 1:

// Input: root = [1,2,3,null,5,null,4]

// Output: [1,3,4]

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<Integer>();
        rightview(root,result,0);
        return result;
    }
    public void rightview(TreeNode curr,List<Integer>result,int currdepth){
        if(curr==null){
            return;
        }
        if(currdepth==result.size()){
        result.add(curr.val);
        }
        rightview(curr.right,result,currdepth+1);
        rightview(curr.left,result,currdepth+1);
    }
}
