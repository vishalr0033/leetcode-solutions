class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
    static void rev(char[] a,int l , int r){
        if(l >= r){
            return;
        }
        char temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        rev(a,l+1,r-1);
    }
}