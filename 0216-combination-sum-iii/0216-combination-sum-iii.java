class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
    static void fun(List<List<Integer>> ans,List<Integer> list ,int target,int k,int start){
        if(list.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(list));
                return;
            }
        }
        if(target < 0) return;
        for(int i=start;i<=9;i++){
            list.add(i);
            fun(ans,list,target-i,k,i+1);
            list.remove(list.size()-1);
        }
    }
}