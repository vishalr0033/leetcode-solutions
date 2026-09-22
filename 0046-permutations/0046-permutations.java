class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean bol[] = new boolean[nums.length];
        fun(nums,new ArrayList<>(),ans,bol);
        return ans;
    }
    static void fun(int []arr,List<Integer> curr,List<List<Integer>> ans,boolean[] bol){
        if(arr.length==curr.size()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!bol[i]){
                bol[i] = true;
                curr.add(arr[i]);
                fun(arr,curr,ans,bol);
                curr.remove(curr.size()-1);
                bol[i]=false;
            }
        }
    }
}