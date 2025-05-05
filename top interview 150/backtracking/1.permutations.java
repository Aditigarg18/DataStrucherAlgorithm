//leetcode 46
// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
class Solution {
    List<List<Integer>>result=new ArrayList<>();
    Set <Integer>used=new HashSet<>();
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n=nums.length;
        List<Integer>temp=new ArrayList<>();
        solve(temp,nums);
        return result;
        }
private  void solve( List<Integer>temp,int[]nums){
    if(temp.size()==n){
        result.add(new ArrayList<>(temp));
        return;
    }
    for(int i=0;i<n;i++){
        int num=nums[i];
        if(!used.contains(num)){
            temp.add(num);
            used.add(num);
            solve(temp,nums);
            used.remove(num);
            temp.remove(temp.size()-1);
        }
    }
}
}
