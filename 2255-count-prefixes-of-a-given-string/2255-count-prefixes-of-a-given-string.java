class Solution {
    public int countPrefixes(String[] words, String s1) {
        // char a = s1.charAt(0);
        // String s = String.valueOf(a);
        int c = 0;
        for(int i=0;i<words.length;i++){
            if(s1.startsWith(words[i])){
                c++;
            }
        }
        return c;
        
    }
}