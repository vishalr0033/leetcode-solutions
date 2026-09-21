class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean bol[] = new boolean[nums.length];
        fun(nums,new ArrayList<>(),ans,bol);
        return ans;
    }
    static void fun(int[] arr,List<Integer> curr,List<List<Integer>> ans,boolean[] fre){
        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!fre[i]){
                fre[i] = true;
                curr.add(arr[i]);
                fun(arr,curr,ans,fre);
                curr.remove(curr.size()-1);
                fre[i] = false;
            }
        }
    }
}