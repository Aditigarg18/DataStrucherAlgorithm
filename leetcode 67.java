class Solution {
    public String addBinary(String a, String b) {
           StringBuilder ans = new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0){
            int count1=0;
            if(i>=0 && a.charAt(i)=='1')count1++;
            if(j>=0 && b.charAt(j)=='1')count1++;
            if(count1+carry==0){
                ans.append('0');
                carry=0;
            }
            else if(count1+carry==1){
                ans.append('1');
                carry=0;
            }
             else if(count1+carry==2){
                ans.append('0');
                carry=1;
            }
            else if(count1+carry==3){
                ans.append('1');
                carry=1;
            }
        i--;
        j--;
        }
        if(carry==1)ans.append('1');
       return  ans.reverse().toString();
    }
}
