class Solution {
    static int count = 0;
    public int countArrangement(int n) {
        count = 0;
        boolean []bol = new boolean[n+1];
        per(1,bol,n);
        return count;
    }
    static void per(int pos, boolean bol[] , int n){
        if(pos > n){
            count++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(!bol[i] && (i%pos==0 || pos%i==0)){
                bol[i] = true;
                per(pos+1,bol,n);
                bol[i] = false;
            }
        }
    }
}