class Solution {
    public int countLargestGroup(int n) {
        int hash[] = new int[37];
        for(int i=1;i<=n;i++){
            hash[sum(i)]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<37;i++){
            if(hash[i] > max){
                max = hash[i];
            }
        }
        int count = 0;
        for(int i=0;i<36;i++){
            if(hash[i]==max){
                count++;
            }
        }
        return count;
    }
    static int sum(int a){
        int s = 0;
        while(a>0){
            int temp = a % 10;
            s += temp;
            a /= 10;
        }
        return s;
    }
}