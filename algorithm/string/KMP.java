class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer>result=new ArrayList<>();
        int N=txt.length();
        int M=pat.length();
        int [] lps=computeLPS(pat);
        int i=0;
        int j=0;
        while(i<N){
            if(j<M && pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==M){
                result.add(i-j);
                j=lps[j-1];
            }
            else if(i<N &&(j==0|| pat.charAt(j)!=txt.charAt(i))){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
                }
            }
            return result;
        }
        private int[]computeLPS(String pattern){
            int M=pattern.length();
            int[] lps=new int[M];
            int len=0;
            lps[0]=0;
            int i=1;
            while(i<M){
                if(pattern.charAt(i)==pattern.charAt(len)){
                    len++;
                    lps[i]=len;
                    i++;
                }
                else{
                    if(len!=0){
                        len=lps[len-1];
                    }
                    else{
                        lps[i]=0;
                        i++;
                    }
                }
            }
            return lps;
    }
}
