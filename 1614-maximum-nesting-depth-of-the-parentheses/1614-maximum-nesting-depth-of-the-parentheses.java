class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                max = Math.max(max,stack.size());
                stack.pop();
            }
        }
        return max;
    }
}