class Solution {
    public int rearrangeCharacters(String s, String target) {
        int min = Integer.MAX_VALUE;
        int hash[] = new int[26];
        int hash1[] = new int[26];
        for(char ch : s.toCharArray()){
            hash[ch-'a']++;
        }
        for(char ch : target.toCharArray()){
            hash1[ch-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(hash1[i] > 0){
                min = Math.min(min,hash[i]/hash1[i]);
            }
        }
        return min;
    }
}