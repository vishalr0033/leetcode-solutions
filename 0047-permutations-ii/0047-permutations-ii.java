class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // nums = mergesort(nums);
        Set<List<Integer>> an = new HashSet<>();
        fun(0,nums,an);
        List<List<Integer>> ans = new ArrayList<>(an);
        return ans;
    }
    static void fun(int index,int[] nums,Set<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            fun(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] mergesort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int left[],int right[]){
        int ans[] = new int[left.length + right.length];
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