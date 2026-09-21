class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,cand,new ArrayList<>(),target,ans);
        return ans;
    }
    static void fun(int index,int[] cand,List<Integer> curr,int target,List<List<Integer>> ans){
        if(index == cand.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
                return;
            }else{
                return;
            }
        }
        curr.add(cand[index]);
        if(cand[index] <= target){
            fun(index,cand,curr,target-cand[index],ans);
        }
        curr.remove(curr.size() - 1);
        fun(index+1,cand,curr,target,ans);
    }
}