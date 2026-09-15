class Solution {
    public int lengthOfLongestSubstring(String s) {
        // List<Character> list = new ArrayList<>();
        // int max = 0;
        
        // for(char ch : s.toCharArray()){
        //     int l = 0;
        //     if(!list.contains(ch)){
        //         list.add(ch);
        //     }else{
        //         max = Math.max(max,list.size());
        //         while(list.get(l)!=ch){
        //             list.remove(list.get(l));
        //         }
        //         list.remove(l);
        //         list.add(ch);
        //     }
            
        // }
        // max = Math.max(max,list.size());
        // return max;
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        int n = s.length();
        int l = 0;
        int r = 0;
       
        int max = 0;
        while(r<n){
             int len = 0;
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)] +1;
                }
            }
            len = r-l+1;
            max = Math.max(max,len);
            hash[s.charAt(r)] = r;
            r++;
        }
        return max;
    }
}