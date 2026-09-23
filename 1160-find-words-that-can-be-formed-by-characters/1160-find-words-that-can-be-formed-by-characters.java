class Solution {
    public int countCharacters(String[] words, String chars) {
        int hash[] = new int[26];
        for(char ch : chars.toCharArray()){
            hash[ch-'a']++;
        }
        int count = 0;
        for(int i = 0; i < words.length;i++){
            String a = words[i];
            int fre[] = new int[26];
            boolean bol = true;
            for(int j=0;j<a.length();j++){
                int c = a.charAt(j)-'a';
                fre[c]++;
                if(fre[c] > hash[c]){
                    bol = false;
                    break;
                }
            }
            if(bol){
                count += a.length();
            }
        }
        return count;
    }
}