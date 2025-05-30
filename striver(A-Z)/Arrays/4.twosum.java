// leetcode 1
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer>mpp=new HashMap<>();
        ans[0]=ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int moreneed=target-num;
            if(mpp.containsKey(moreneed)){
                ans[0]=mpp.get(moreneed);
                ans[1]=i;
                return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}
