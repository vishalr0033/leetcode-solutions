class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ch : nums){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==3 && !set.contains(nums[i])){
                set.add(nums[i]);
                int x = Integer.MIN_VALUE;
                int y = Integer.MIN_VALUE;
                for(int j=i+1;j<n;j++){
                    if(nums[i]==nums[j]){
                        x = j - i;
                        for(int k=j+1;k<n;k++){
                            if(nums[k]==nums[j]){
                                y = k - j;
                                break;
                            }
                        }
                        break;
                    }
                }
                if(x==y && x!=Integer.MIN_VALUE && y!=Integer.MIN_VALUE){
                    count++;
                }
            }
        }
        return count;
    }
}