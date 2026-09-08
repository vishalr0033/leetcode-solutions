// class Solution {
//     public int lastRemaining(int n) {
//         int arr[] = new int[n];
//         for(int i = 1; i <= n; i++) {
//             arr[i - 1] = i;
//         }
//         return lr(arr);
//     }
//     static int lr(int[] arr) {
//         if(arr.length == 1) {
//             return arr[0];
//         }
//         int ans[] = new int[arr.length / 2];
//         int k = 0;
//         for(int i = 1; i < arr.length; i += 2) {
//             ans[k++] = arr[i];
//         }
//         return rr(ans);
//     }
//     static int rr(int[] arr) {
//         if(arr.length == 1) {
//             return arr[0];
//         }
//         int ans[] = new int[arr.length / 2];
//         int k = 0;
//         for(int i = 0; i < arr.length; i++) {
//             if(i % 2 == arr.length % 2) {
//                 ans[k++] = arr[i];
//             }
//         }
//         return lr(ans);
//     }
// }
class Solution {
    public int lastRemaining(int n) {
        if(n==1) return n;
        return 2*(1+n/2-lastRemaining(n/2));
    }
}