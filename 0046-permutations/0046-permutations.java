class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean bol[] = new boolean[nums.length];
        List<List<Integer>> list = new ArrayList<>();
        fun(new ArrayList<>(),list,nums,bol);
        return list;
    }
    static void fun(List<Integer> li,List<List<Integer>> list,int []num,boolean[] flag){
        if(num.length==li.size()){
            list.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(!flag[i]){
                flag[i] = true;
                li.add(num[i]);
                fun(li,list,num,flag);
                li.remove(li.size()-1);
                flag[i] = false;
            }
        }
    }
}