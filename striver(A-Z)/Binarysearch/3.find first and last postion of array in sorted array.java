//leetcode 34
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
class Solution {
    public int firstoccurance(int[]nums,int target){
        int low=0,high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                  low=mid+1;     
            }
            else{
                high=mid-1;
            }
        }
            return first;
        }

    public int lastoccurance(int[] nums,int target){
        int low=0,high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
               last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                  low=mid+1;     
            }
            else{
                high=mid-1;
            }
        }
            return last;
        }

    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        int first=firstoccurance(nums,target);
        if(first==-1){
            ans[0]=-1;
            ans[1]=-1;
        }
        int last=lastoccurance(nums,target);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
}
