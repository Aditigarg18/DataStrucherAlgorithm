//leetcode3
//  Given a string s, find the length of the longest substring without duplicate characters.

 

//  Example 1:

// Input: s = "abcabcbb"
//  Output: 3
//  Explanation: The answer is "abc", with the length of 3.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mpp=new HashMap<>();
        int left=0,right=0,len=0;
        int n=s.length();
        while(right<n){
            if(mpp.containsKey(s.charAt(right))){
                left=Math.max(mpp.get(s.charAt(right))+1,left);
            }
            mpp.put(s.charAt(right),right);
            len=Math.max(right-left+1,len);
            right++;
        }
        return len;
    }
}
