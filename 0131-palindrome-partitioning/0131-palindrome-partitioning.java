class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        fun(0,s,new ArrayList<>(),ans);
        return ans;
    }
    static void fun(int index,String a,List<String> list,List<List<String>> ans){
        if(index == a.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<a.length();i++){
            if(ispalin(a,index,i)){
                list.add(a.substring(index,i+1));
                fun(i+1,a,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    static boolean ispalin(String a , int start, int end){
        while(start <= end){
            if(a.charAt(start)!=a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}