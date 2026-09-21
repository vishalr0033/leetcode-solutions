class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean bol[] = new boolean[nums.length];
        fun(nums,new ArrayList<>(),ans,bol);
        return ans;
    }
    static void fun(int[] arr,List<Integer> ds,List<List<Integer>> list,boolean[] bol){
        if(arr.length == ds.size()){
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!bol[i]){
                bol[i] = true;
                ds.add(arr[i]);
                fun(arr,ds,list,bol);
                ds.remove(ds.size()-1);
                bol[i] = false;
            }
        }
    }
}