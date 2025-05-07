// Given an array of positive integers arr[], return the second largest element from the array. If the second largest
//   element doesn't exist then return -1.

// Note: The second largest element should not be equal to the largest element.

// Examples:

// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=arr[0];
        int second_largest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
}
