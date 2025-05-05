//leetcode 704
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
// If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

class Solution {
    public int bs(int[]nums,int low,int high,int target){
        if(low>high) {
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(target>nums[mid]){
            return bs(nums,mid+1,high,target);
        }
        else{
            return bs(nums,low,mid-1,target);
        }
    }
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    
        //  int low=0,high=nums.length-1;
        // while( low<=high){
        //     int  mid=(low+high)/2;
        //       if(nums[mid]==target){
        //         return mid;
        //       }
        //     else if(nums[mid]<target){
        //             low=mid+1;
        //     }
        //     else{
        //              high=mid-1;
        //     }
        // }
        // return -1;
    }
}
