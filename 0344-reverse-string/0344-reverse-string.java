class Solution {
    public void reverseString(char[] a) {
        rev(a,0,a.length-1);
    }
    static void rev(char[] a , int l, int n){
        if(l==n/2+1){
            return;
        }
        char temp = a[l];
        a[l] = a[n-l];
        a[n-l] = temp;
        rev(a,l+1,n);
    }
}