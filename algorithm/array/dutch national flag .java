//sort 0,1,2 in a array
    
class Solution {
    public void sortColors(int[] nums) {
        int mid=0,low=0,high=nums.length-1;
          while (mid <= high) { 
       if( nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        low++;
        mid++;
       }
       else if(nums[mid]==1){
        mid++;
       }
       else if(nums[mid]==2){
        int temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;
       }
          }
     }
}
