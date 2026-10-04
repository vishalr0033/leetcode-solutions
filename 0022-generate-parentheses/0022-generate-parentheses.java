class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gp(ans,new StringBuilder(),0,0,n);
        return ans;        
    }
    static void gp(List<String> list,StringBuilder s,int open ,int close,int n){
        if(s.length()==2*n){
            list.add(s.toString());
            return;
        }
        if(n > open){
            s.append('(');
            gp(list,s,open+1,close,n);
            s.deleteCharAt(s.length()-1);
        }
        if(open > close){
            s.append(')');
            gp(list,s,open,close+1,n);
            s.deleteCharAt(s.length()-1);
        }
    }
}