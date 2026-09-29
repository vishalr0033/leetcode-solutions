class Solution {
    public int integerReplacement(int n) {
        return fun((long)n);
    }
    static int fun(long a){
        int ans = 0;
        if(a <= 1){
            return 0;
        }
        if(a % 2 == 0){
            ans = 1 + fun(a/2);
        }else{
            ans = Math.min(1+fun(a-1),1+fun(a+1));
        }
        return ans;
    }
}