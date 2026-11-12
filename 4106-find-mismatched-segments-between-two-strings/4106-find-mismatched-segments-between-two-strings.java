class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        int l = 0;
        int n = s1.length();
        String a = "";
        String b = "";
        List<String> li = new ArrayList<>();
        while(l<n){
            if(s1.charAt(l)!=s2.charAt(l)){
                a += s1.charAt(l);
                b += s2.charAt(l);
                l++;
            }
            else if(a.length()>0){
                li.add(a);
                li.add(b);
                ans.add(li);
                a = "";b = "";
                li = new ArrayList<>();
                l++;
            }else{
                l++;
            }
        }
        if(a.length()>0){
            li.add(a);
            li.add(b);
            ans.add(li);
        }
        return ans;
    }
}