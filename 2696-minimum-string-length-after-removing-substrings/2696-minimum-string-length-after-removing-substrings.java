class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                char b = stack.peek();
                if((b=='A' && ch=='B') || (b=='C' && ch=='D')){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}