class Solution {
    public long countIntersectingIntervals(int[][] inter) {
        int n = inter.length;
        int start[] = new int[n];
        int end[] = new int[n];
        for(int i=0;i<n;i++){
            start[i] = inter[i][0];
            end[i] = inter[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int j = 0;
        long count = 0;
        for(int i=0;i<n;i++){
            while(j<n && end[j] < start[i]){
                j++;
            }
            count += i - j;
        }
        return count;
    }
}