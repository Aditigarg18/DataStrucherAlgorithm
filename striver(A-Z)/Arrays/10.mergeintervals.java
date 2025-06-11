//leetcode 56
class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });
        List<int[]>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
        while(i+1<n && intervals[i+1][0]<=end){
            end=Math.max(end,intervals[i+1][1]);
            i++;
        }
        ans.add(new int[]{start,end});
        }  
        return ans.toArray(new int[ans.size()][]);
    }
}
