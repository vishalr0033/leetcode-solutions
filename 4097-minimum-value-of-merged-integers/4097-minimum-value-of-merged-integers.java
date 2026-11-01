class Solution {
    public int minMergedInteger(int[] arr) {
        int ans[] = new int[arr.length/2];
        int min = Integer.MAX_VALUE;
        int k = 0;
        for(int i=0;i<arr.length;i+=2){
            String sb = "";
            sb = arr[i]+""+arr[i+1];
            ans[k++] = Integer.parseInt(sb);
        }
        for(int i=0;i<ans.length;i++){
            min = Math.min(min,ans[i]);
        }
        return min;
    }
}