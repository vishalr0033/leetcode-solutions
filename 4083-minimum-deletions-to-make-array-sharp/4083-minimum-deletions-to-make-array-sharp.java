class Solution {
    public int minDeletions(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            int temp = nums[i]^nums[i+1];
            System.out.print(temp+" ");
            if(temp ==0){
                sum++;
            }
        }
        return sum;
    }
}