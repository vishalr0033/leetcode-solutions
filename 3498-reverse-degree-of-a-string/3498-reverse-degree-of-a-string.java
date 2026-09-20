class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int pro = 1;
        for(char ch : s.toCharArray()){
            int temp = Math.abs(ch-'z');
            ans += (temp+1) * pro;
            System.out.print(ans);
            pro++;
        }
        return ans;
    }
}