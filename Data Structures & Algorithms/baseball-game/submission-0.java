class Solution {
    public int calPoints(String[] operations) {
        int top = -1;
        int n = operations.length;
        int[] stack = new int[n];

        for(String s : operations) {
            switch(s){
          case "+":
                int sum = stack[top] + stack[top-1];
                stack[++top] = sum;
                break;
            case "C":
                stack[top--] = 0;
                break;
            case "D":
                int prod = stack[top] * 2;
                stack[++top] = prod;
                break;
            default:
               stack[++top] = Integer.parseInt(s);
            }
  
        }

        int res = 0;
        for(int i = 0; i < stack.length; i++) {
            res += stack[i];
        }
        return res;
    }
}