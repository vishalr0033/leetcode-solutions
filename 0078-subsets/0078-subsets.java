class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,list,new ArrayList<>(),ans);
        return ans;
    }
    static void fun(int index,List<Integer> list,List<Integer> curr,List<List<Integer>> ans){
        if(index >= list.size()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(list.get(index));
        fun(index+1,list,curr,ans);
        curr.remove(curr.size()-1);
        fun(index+1,list,curr,ans);
    }
}