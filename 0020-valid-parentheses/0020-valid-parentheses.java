class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                char b = stack.peek();
                if(b=='(' && ch==')'){
                    stack.pop();
                }else if(b=='[' && ch==']'){
                    stack.pop();
                }else if(b=='{' && ch=='}'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }
}