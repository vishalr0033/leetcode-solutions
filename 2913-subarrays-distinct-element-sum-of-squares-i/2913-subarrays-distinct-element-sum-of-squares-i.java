class Solution {
    public int sumCounts(List<Integer> list) {
        int ans = 0;
        for(int i=0;i<list.size();i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<list.size();j++){
                set.add(list.get(j));
                ans += set.size()*set.size();
            }
        }
        return ans;
    }
}