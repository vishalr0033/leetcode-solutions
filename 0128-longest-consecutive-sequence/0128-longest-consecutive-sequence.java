class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        nums = mergesort(nums);
       int cur = 0;
       int max = 0;
       for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                cur++;
            }else if(nums[i+1]-nums[i]==0){
                cur = cur;
            }else{
                max = Math.max(cur,max);
                cur = 0;
            }
        }
        max = Math.max(cur,max);
        return max+1;
    }
    static int[] mergesort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int left[],int []right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[left.length+right.length];
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