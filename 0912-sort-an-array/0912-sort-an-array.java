// class Solution {
//     public int[] sortArray(int[] nums) {
//         return mergesort(nums);
//     }
//     static int[] mergesort(int arr[]){
//         if(arr.length==1){
//             return arr;
//         }
//         int mid = arr.length/2;
//         int left[] = mergesort(Arrays.copyOfRange(arr,0,mid));
//         int right[] = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
//         return merge(left,right);
//     }
//     static int[] merge(int left[],int right[]){
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         int ans[] = new int[left.length+right.length];
//         while(i<left.length && j<right.length){
//             if(left[i] < right[j]){
//                 ans[k++] = left[i++];
//             }else{
//                 ans[k++] = right[j++];
//             }
//         }
//         while(i<left.length){
//             ans[k++] = left[i++];
//         }
//         while(j<right.length){
//             ans[k++] = right[j++];
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] sortArray(int[] nums) {
        quick(nums,0,nums.length-1);
        return nums;
    }
    static void quick(int arr[],int l,int r){
        if(l < r){
            int par = quicksort(arr,l,r);
            quick(arr,l,par-1);
            quick(arr,par,r);
        }
    }
    static int quicksort(int arr[],int l,int r){
        int i = l;
        int j = r;
        int pivot = arr[l];
        while(i <= j){
            while(arr[i] < pivot && i<=r){
                i++;
            }
            while(arr[j] > pivot && j>=l){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}