class Solution {
    public int minDeletions(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            int temp = nums[i]^nums[i+1];
            if(temp ==0){
                sum++;
            }
        }
        return sum;
    }
}