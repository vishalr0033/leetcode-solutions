class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(can);
        fun(0,can,new ArrayList<>(),list,target);
        return list;
    }
    static void fun(int index,int[] can,List<Integer> li,List<List<Integer>> list ,int target){
        if(target==0){
            list.add(new ArrayList<>(li));
        }
        for(int i=index;i<can.length;i++){
            if(i > index && can[i]==can[i-1]) continue;
            if(can[i] > target) break;
            li.add(can[i]);
            fun(i+1,can,li,list,target-can[i]);
            li.remove(li.size()-1);
        }
    }
}