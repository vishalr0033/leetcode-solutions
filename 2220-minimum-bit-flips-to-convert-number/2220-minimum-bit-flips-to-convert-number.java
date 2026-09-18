class Solution {
    public int minBitFlips(int start, int goal) {
        String a = Integer.toBinaryString(start);
        String b = Integer.toBinaryString(goal);
        if(a.length() > b.length()){
            while(b.length() != a.length()){
                b = "0" + b;
            }
        }else{
            while(a.length() != b.length()){
                a = "0" + a;
            }
        }
        int count = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
        }
        return count;
    }
        
}