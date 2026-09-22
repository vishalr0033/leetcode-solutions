class Solution {
    public int findComplement(int num) {
        return Integer.parseInt(fun(num),2);
    }
    static String fun(int num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int temp = num % 2;
            if(temp==0){
                sb.append(1);
            }else{
                sb.append(0);
            }
            num /= 2;
        }
        return sb.reverse().toString();
    }
}