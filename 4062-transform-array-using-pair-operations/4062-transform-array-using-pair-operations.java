class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum = 0;
        long sum1 = 0;
        for(int s : source){
            sum+=s;
        }
        for(int t : target){
            sum1+=t;
        }
        return sum==sum1;
    }
}