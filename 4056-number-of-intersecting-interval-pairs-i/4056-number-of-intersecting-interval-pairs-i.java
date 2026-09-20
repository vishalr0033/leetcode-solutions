class Solution {
    public int countIntersectingIntervals(int[][] inter) {
        int n = inter.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(inter[i][0] <= inter[j][1] && inter[j][0] <= inter[i][1]){
                    count++;
                }
            }
        }
        return count;
    }
}