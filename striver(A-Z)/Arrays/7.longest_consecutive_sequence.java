// 128. Longest Consecutive Sequence
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1,count=0,last_small=Integer.MIN_VALUE;
        Arrays.sort(nums);
        if(nums.length==0)return 0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]-1==last_small){
                count++;
                last_small=nums[i];
              }
              else if(nums[i]!=last_small){
                count=1;
                last_small=nums[i];
              }
              longest=Math.max(longest,count);
        }
        return longest;
    }
}
