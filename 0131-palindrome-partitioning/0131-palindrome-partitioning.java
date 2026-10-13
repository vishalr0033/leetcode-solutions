class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        fun(0,new ArrayList<>(),ans,s);
        return ans;
    }
    static void fun(int index, List<String> list , List<List<String>> ans , String s){
        if(index == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalin(index,i,s)){
                list.add(s.substring(index,i+1));
                fun(i+1,list,ans,s);
                list.remove(list.size()-1);
            }
        }
    }
    static boolean isPalin(int i,int j , String s){
        while(i <= j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }i++;j--;
        }
        return true;
    }
}