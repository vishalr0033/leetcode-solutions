class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<k;i++){
            if(vow(s.charAt(i))){
                count++;
            }
        }
        int max = count;
        for(int i=k;i<n;i++){
            if(vow(s.charAt(i))){
                count++;
            }
            if(vow(s.charAt(i-k))){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    static boolean vow(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}