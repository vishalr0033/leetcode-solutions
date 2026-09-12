class Solution {
    public int[] minCosts(int[] cost) {
        int min = cost[0];
        int arr[] = new int[cost.length];
        for(int i=0;i<cost.length;i++){
            min = Math.min(min,cost[i]);
            arr[i] = min;
        }
        return arr;
    }
}