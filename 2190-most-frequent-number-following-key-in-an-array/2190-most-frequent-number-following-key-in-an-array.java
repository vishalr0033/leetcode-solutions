class Solution {
    public int mostFrequent(int[] nums, int key) {
        int hash[] = new int[1001];
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]==key){
                hash[nums[i+1]]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<1001;i++){
            if(max < hash[i]){
                max = hash[i];
                ans = i;
            }
        }
        return ans;
    }
}