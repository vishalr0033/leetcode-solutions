class Solution {
    public int minOperations(int n) {
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = (2*i) + 1;
        }
        int a = (arr[0] + arr[n-1]) / 2;
        int ans = 0;
        for(int i=0;i<n/2;i++){
            ans += a-arr[i];
        }
        return ans;
    }
}