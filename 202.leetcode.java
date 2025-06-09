class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer>set=new HashSet<>();
       int num=n;// creating a variable num and storing the value eg num=19
// we are checking a condition that the number must not be equal to 1 and in our set the number must not be. if it is not there we are adding the number in the set 
       while(num!=1 && !set.contains(num)){
          set.add(num);
          int ans=0;
          while(num>0){  
            int d=num%10;
            ans+=d*d;
            num/=10;
          }
          num=ans;
       }
       return num==1;
    }
}
