class Solution {
    public int pivotInteger(int n) {
        int num[] = new int[n];
        for(int i=1;i<=n;i++){
            num[i-1] = i;
        }
        
        int pre[] = new int[n];
        int suf[] = new int[n];
        pre[0] = 1;
        suf[suf.length-1] = n;
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1] + num[i];
        }
        for(int i=n-2;i>=0;i--){
            suf[i] = num[i] + suf[i+1];
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i]){
                return i+1;
            }
        }
        return -1;
    }
}