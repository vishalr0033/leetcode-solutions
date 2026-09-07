class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = 0;
        int temp = 0;
        for(int i=0 ;i<requests.length;i++){
            ans += Math.abs(temp-requests[i]);
            temp = requests[i];
        }
        return ans;
    }
}