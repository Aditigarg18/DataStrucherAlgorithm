//leetcode 5
class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int maxlen=1;
        for(int i=0;i<s.length();i++){
            int l=i-1;
            int r=i;
            while(l>=0 && r<s.length()&&s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxlen){
                    maxlen=r-l+1;
                    start=l;
                }
                l--;
                r++;
            }
            l=i-1;
            r=i+1;
            while(l>=0 && r<s.length()&&s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxlen){
                    maxlen=r-l+1;
                    start=l;
                }
                l--;
                r++;
            }
        }
        return s.substring(start,start+maxlen);
    }
}
