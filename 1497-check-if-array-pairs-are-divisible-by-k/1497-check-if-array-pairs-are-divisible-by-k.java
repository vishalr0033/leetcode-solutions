class Solution {
    public boolean canArrange(int[] arr, int k) {
        // int n = arr.length;
        // long z = (long)k*(n/2);
        // long sum = 0;
        // for(int i : arr){
        //     sum += (long)i;
        // }
        // System.out.print(sum);
        // long a = (long)k;
        // if(sum != 0 && z>sum){
        //     return false;
        // }
        // return sum%k==0;
        // int n = arr.length;
        // Arrays.sort(arr);
        // int rem = 0; 
        // for(int i=0;i<n/2;i++){
        //     rem = ((arr[i]+arr[n-i-1])+rem) % k;
        // }
        // return rem==0;
        int n = arr.length;
        int hash[] = new int[k];
        for(int i=0;i<n;i++){
            int rem = arr[i] % k;
            if(rem < 0){
                rem += k;
            }
            hash[rem]++;
        }
        if(hash[0] % 2 != 0){
            return false;
        }
        for(int i=1;i<k;i++){
            if(hash[i] != hash[k-i]){
                return false;
            }
        }
        return true;
    }
}