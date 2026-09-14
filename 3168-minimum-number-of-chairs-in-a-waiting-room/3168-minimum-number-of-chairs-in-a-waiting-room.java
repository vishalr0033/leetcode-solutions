class Solution {
    public int minimumChairs(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                char b = stack.peek();
                if(b=='E' && ch=='L'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                    max = Math.max(max,stack.size());
                }
            }
            max = Math.max(max,stack.size());
        }
        return max;
    }
}