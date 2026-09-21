class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        nums = mergesort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    static void fun(int index,int[] arr,List<Integer> list,List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            fun(i+1,arr,list,ans);
            list.remove(list.size()-1);
        }
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
        int ans[] = new int[left.length+right.length];
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