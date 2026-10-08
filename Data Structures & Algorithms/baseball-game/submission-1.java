class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s : operations) {
            if(s.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if(s.equals("C")) {
                stack.pop();
            } else if(s.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        int res = 0;
        for(int score : stack) {
            res += score;
        }
        return res;
    }
}