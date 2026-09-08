class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for(String ch : words1){
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }
        for(String ch : words2){
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }
        int count = 0;
        for(int i=0;i<words1.length;i++){
            for(int j=0;j<words2.length;j++){
                if(words1[i].equals(words2[j]) && map1.get(words1[i])==1 && map2.get(words2[j])==1){
                    count++;
                }
            }
        }
        return count;
    }
}