class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] square = new long[n];
        for(int i=0;i<n;i++){
            square[i] = (long)nums[i]*nums[i];
        }
        square = mergesort(square);
        int limit = n/2;
        int l = 0;
        int r = nums.length-1;
        long temp = 0;
        long temp1 = 0;
        int dummy = 0;
        while(l <= r){
            if(dummy < limit){
                temp1+=square[l];
                l++;
                dummy++;
            }else{
                temp+=square[r];
                r--;
            }
        }
        return temp-temp1;
    }
    static long[] mergesort(long[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        long left[] = mergesort(Arrays.copyOfRange(arr,0,mid));
        long right[] = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static long[] merge(long left[],long right[]){
        long ans[] = new long[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[k++] = left[i++];
            }else{
                ans[k++] = right[j++];
            }
        }
        while(i < left.length){
            ans[k++] = left[i++];
        }
        while(j < right.length){
            ans[k++] = right[j++];
        }
        return ans;
    }
}