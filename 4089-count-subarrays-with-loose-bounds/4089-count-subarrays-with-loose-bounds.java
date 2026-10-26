class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long a = 0;
        int count = 0;
        for(int i : nums){
            if(i >= minK && i <= maxK){
                count++;
                a += count;
            }else{
                count = 0;
            }
        }
        return a;
    }
}