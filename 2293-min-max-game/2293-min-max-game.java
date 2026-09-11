class Solution {
    public int minMaxGame(int[] nums) {
        return minmax(nums);
    }
    static int minmax(int []arr){
        if(arr.length==1){
            return arr[0];
        }
        int mid = arr.length/2;
        int ans[] = new int[mid];
        int eve = 0;
        int odd = 1;
        for(int i=0;i<arr.length;i+=4){
            ans[eve] = Math.min(arr[i],arr[i+1]);
            eve += 2;
        }
        for(int i=2;i<arr.length;i+=4){
            ans[odd] = Math.max(arr[i],arr[i+1]);
            odd += 2;
        }
        return minmax(ans);
    }
}