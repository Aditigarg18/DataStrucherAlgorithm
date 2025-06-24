//leecode 118
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
class Solution {
    public static int ncr(int n,int r){
    long res=1;
    for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    return (int)res;
}
  public List<List<Integer>> generate(int numRows) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            List<Integer> templist = new ArrayList<>();
        for(int col=1;col<=row;col++){
            templist.add(ncr(row-1,col-1));
        }
        ans.add(templist);
    }
    return ans;
  }
}
