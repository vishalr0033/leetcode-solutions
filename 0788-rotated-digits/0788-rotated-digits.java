class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(rd(i)){
                count++;
            }
        }
        return count;
    }
    static boolean rd(int a){
        if(a==2 || a==5 || a==6 || a==9){
            return true;
        }
        if(a==1 || a==10 || a==100 || a==1000 || a==10000){
            return false;
        }
        if(a==1 || a==11 || a==111 || a==1111){
            return false;
        }
        if(a==3 || a==4 || a==7 || a==8){
            return false;
        }
        int b = a;
        while(a>0){
            int temp = a%10;
            if(temp==3 || temp==4 || temp==7 ){
                return false;
            }
            a/=10;
        }
        int len = 0;
        int count = 0;
        while(b>0){
            int temp = b%10;
            if(temp==0 || temp==1 || temp==8){
                count++;
            }
            len++;
            b/=10;
        }
        if(len == count){
            return false;
        }
        return true;
    }
}