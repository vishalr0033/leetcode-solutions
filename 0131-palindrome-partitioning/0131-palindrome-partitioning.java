class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        fun(0,new ArrayList<>(),ans,s);
        return ans;
    }
    static void fun(int index,List<String> curr,List<List<String>> list,String s){
        if(index==s.length()){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalin(index,i,s)){
                curr.add(s.substring(index,i+1));
                fun(i+1,curr,list,s);
                curr.remove(curr.size()-1);
            }
        }
    }
    static boolean isPalin(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}