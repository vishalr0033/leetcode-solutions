class Solution {
    public int minRotations(String s) {
        int ans = 0;
        ans += Math.min(s.charAt(0)-'0',10-(s.charAt(0)-'0'));
        for(int i = 1;i < s.length();i++){
            int a = s.charAt(i-1)-'0';
            int b = s.charAt(i)-'0';
            int c = Math.abs(a-b);
            ans += Math.min(c,10-c);
        }
        return ans;
    }
}