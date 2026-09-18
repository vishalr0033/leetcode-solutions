class Solution {
    public int hammingDistance(int x, int y) {
        String x1 = Integer.toBinaryString(x);
        String y1 = Integer.toBinaryString(y);
        
        if(x1.length() > y1.length()){
            while(y1.length()!=x1.length()){
                y1 = "0" + y1;
            }
        }else{
            while(y1.length()!=x1.length()){
                x1 = "0" + x1;
            }
        }
        int count = 0;
        for(int i=0;i<x1.length();i++){
            if(x1.charAt(i)!=y1.charAt(i)){
                count++;
            }
        }
        return count;
    }
}