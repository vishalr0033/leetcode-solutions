class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Long>> list = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            long num = 1;
            List<Long> li = new ArrayList<>();
            for(int j=0;j<=i;j++){
                li.add(num);
                num = num*(i-j) / (j+1);
            }
            list.add(li);
        }
        List<Long> li = list.get(list.size()-1);
        List<Integer> ans = new ArrayList<>();
        for(Long l : li){
            ans.add(l.intValue());
        }
        return ans;
    }
}