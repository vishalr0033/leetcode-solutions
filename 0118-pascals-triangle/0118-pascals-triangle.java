class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> li = new ArrayList<>();
            int num = 1;
            for(int j=0;j<=i;j++){
                li.add(num);
                num = num * (i-j)/(j+1);
            }
            list.add(li);
        }
        return list;
    }
}