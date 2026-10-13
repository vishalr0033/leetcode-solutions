class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,new ArrayList<>(),ans,nums);
        return ans;
    }
    static void fun(int index,List<Integer> list,List<List<Integer>> ans,int[] arr){
        if(index >= arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        fun(index+1,list,ans,arr);
        list.remove(list.size()-1);
        fun(index+1,list,ans,arr);
    }
}