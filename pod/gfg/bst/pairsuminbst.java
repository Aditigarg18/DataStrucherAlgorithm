
/* 13/02/2025
Given a Binary Search Tree(BST) and a target. Check whether there's a pair of Nodes in the BST with value summing up to the target. 
*/
class Solution {
    void inordertraversal(Node root,ArrayList<Integer>inorder){
        if(root==null)return;
        inordertraversal(root.left,inorder);
        inorder.add(root.data);
        inordertraversal(root.right,inorder);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer>inorder=new ArrayList<>();
        inordertraversal(root,inorder);
        int left=0, right=inorder.size()-1;
        while(left<right){
            int currentsum=inorder.get(left)+inorder.get(right);
            if(currentsum==target)return true;
            if(currentsum<target) left++;
            else right--;
        }
        return false;
    }
}
