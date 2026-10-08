class Solution {
    public boolean isValid(String s) {

        if(s.length() < 2) return false;
        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')' && !stack.isEmpty()) {
                if(stack.peek() == '(') {
                stack.pop();
                    continue;

                } else {

                    return false;
                }
            }

            if(s.charAt(i) == '}' && !stack.isEmpty()) {
                if(stack.peek() == '{') {
                    stack.pop();
                    continue;
                } else {

                    return false;
                }
            }

            if(s.charAt(i) == ']' && !stack.isEmpty()) {
                if(stack.peek() == '[') {
                    stack.pop();
                    continue;

                } else {

                    return false;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
