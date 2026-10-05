class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean[] vis = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(vis[i]) continue;
            List<String> li = new ArrayList<>();
            li.add(strs[i]);
            vis[i] = true;
            int hash[] = new int[26];
            String b = strs[i];
            for(char ch : b.toCharArray()){
                hash[ch-'a']++;
            }
            for(int j=i+1;j<strs.length;j++){
                if(vis[j]) continue;
                String a = strs[j];
                int hash1[] = new int[26];
                boolean bol = true;
                for(char ch : a.toCharArray()){
                    hash1[ch-'a']++;
                }
                for(int k=0;k<26;k++){
                    if(hash[k]!=hash1[k]){ bol = false;
                    break;}
                }
                if(bol){
                    li.add(strs[j]);
                    vis[j] = true;
                }
            }
            list.add(li);
        }
        return list;
    }
}