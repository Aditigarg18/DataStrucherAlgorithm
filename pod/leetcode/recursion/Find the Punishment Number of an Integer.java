class Solution {
    public boolean check(int num,int currnum,int target){
        if(num==0){
        return currnum== target;
        }
        return check(num/10,currnum+num%10,target)||
               check(num/100,currnum+num%100,target)||
               check(num/1000,currnum+num%1000,target)||
               check(num/10000,currnum+num%10000,target);
    }
    public int punishmentNumber(int n) {
    int punishmentnum=0;
    for(int currnum=1;currnum<=n;currnum++){
        int squarenum=currnum*currnum;
        if (check(squarenum,0,currnum)){
            punishmentnum+=squarenum;
        }
    }
        return punishmentnum;
    }
    }
