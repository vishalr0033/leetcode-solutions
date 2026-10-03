class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,candidates,new ArrayList<>(),ans,target);
        return ans;
    }
    static void fun(int index,int can[],List<Integer> list,List<List<Integer>> ans,int target){
        if(index==can.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
                return;
            }else{
                return;
            }
        }
        if(can[index] <= target){
            list.add(can[index]);
            fun(index,can,list,ans,target-can[index]);
            list.remove(list.size()-1);
        }
        fun(index+1,can,list,ans,target);
    }
}