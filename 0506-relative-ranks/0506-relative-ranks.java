class Solution {
    public String[] findRelativeRanks(int[] score) {
        int arr[] = new int[score.length];
        int k = 0;
        for(int ch : score){
            arr[k++] = ch;
        }
        int n = score.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(score[j] > score[j-1]){
                    int temp = score[j];
                    score[j] = score[j-1];
                    score[j-1] = temp;
                }
            }
        }
        HashMap<Integer,String> map = new HashMap<>();
        if(score.length>=3){
            map.put(score[0],"Gold Medal");
            map.put(score[1],"Silver Medal");
            map.put(score[2],"Bronze Medal");
            for(int i=3;i<score.length;i++){
                map.put(score[i],""+(i+1)+"");
            }
        }
        if(score.length==1){
            return new String[]{"Gold Medal"};
        }
        if(score.length==2){
            map.put(score[0],"Gold Medal");
            map.put(score[1],"Silver Medal");
        }
        String[] ans = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}