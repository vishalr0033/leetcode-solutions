class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum = 0;
        int max = 0;
        int ex = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                sum += customers[i];
            }
            else{
                ex += customers[i];
            }
            if(i >= minutes){
                if(grumpy[i-minutes] == 1){
                    ex -= customers[i-minutes];
                }
            }
            max = Math.max(max,ex);
        }
        return max+sum;
    }
}