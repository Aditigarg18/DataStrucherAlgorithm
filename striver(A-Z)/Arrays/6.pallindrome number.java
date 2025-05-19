//leetcode 9
// Given an integer x, return true if x is a palindrome, and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
class Solution {
    public boolean isPalindrome(int x) {
        boolean sol;
        if(x<0) sol= false;
        int n=x;
        int ans=0;
        while(n>0){
            int rem=n%10;
             ans=ans*10+rem;
             n=n/10;
        }
        if(x==ans)sol= true;
        else sol= false;
        return sol;
    }
}
