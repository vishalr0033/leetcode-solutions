class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,cand,new ArrayList<>(),ans,target);
        return ans;
    }
    static void fun(int index,int cand[],List<Integer> list,List<List<Integer>> ans,int target){
        if(index==cand.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
                return;
            }else{
                return;
            }
        }
        if(cand[index] <= target){
            list.add(cand[index]);
            fun(index,cand,list,ans,target-cand[index]);
            list.remove(list.size()-1);
        }
        fun(index+1,cand,list,ans,target);
    }
}