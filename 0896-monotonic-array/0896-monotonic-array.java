class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean bol1 = true;
        boolean bol2 = true;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1] || nums[i]<nums[i+1]){
                continue;
            }else{
                bol1 = false;
            }
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1] || nums[i]>nums[i+1]){
                continue; 
            }else{
                bol2 = false;
            }
        }
        return bol1 || bol2;
    }
}