class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                stack.push(Integer.parseInt(token));
            } else { 
                int top = stack.pop();
                int top2 = stack.pop();
                switch(token) {
                    case "+": 
                        stack.push(top + top2);
                        break;
                    case "-": 
                        stack.push(top2 - top);
                        break;
                    case "*": 
                        stack.push(top * top2);
                        break;
                    case "/": 
                        stack.push(top2 / top);
                        break;
                }
            }
        }
        return stack.peek();
    }
}
