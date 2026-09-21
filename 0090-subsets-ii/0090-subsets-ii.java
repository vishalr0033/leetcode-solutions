class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        fun(0,nums,new ArrayList<>(),ans);
        List<List<Integer>> ans1 = new ArrayList<>(ans);
        return ans1;
    }
    static void fun(int index,int[] list,List<Integer> curr,Set<List<Integer>> ans){
        if(index >= list.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(list[index]);
        fun(index+1,list,curr,ans);
        curr.remove(curr.size()-1);
        fun(index+1,list,curr,ans);
    }
}