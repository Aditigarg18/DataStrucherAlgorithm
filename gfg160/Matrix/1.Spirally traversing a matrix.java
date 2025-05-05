//leetcode 54
// Given an m x n matrix, return all elements of the matrix in spiral order.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        if(mat==null||mat.length==0||mat[0].length==0)return ans;
        int n=mat.length;
        int m=mat[0].length;
        int top=0,bottom=n-1;
        int  left=0,right=m-1;
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                ans.add(mat[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                ans.add(mat[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
