class Solution {
    public boolean digitCount(String num) {
        // Map<Character,Integer> map = new HashMap<>();
        // for(char ch : num.toCharArray()){
        //     if(map.containsKey(ch)){
        //         map.put(ch,map.get(ch)+1);
        //     }else{
        //         map.put(ch,1);
        //     }
        // }
        // boolean bol = true;
        // for(int i=0;i<num.length();i++){
        //     if(map.get(i)!=(num.charAt(i)-'0')){
        //         bol = false;
        //     }
        // }
        // return bol;
        int hash[] = new int[10];
        for(char ch : num.toCharArray()){
            hash[ch-'0']++;
        }
        boolean bol = true;
        for(int i=0;i<num.length();i++){
            if(hash[i] != num.charAt(i)-'0'){
                bol = false;
            }
        }
        return bol;
    }
}