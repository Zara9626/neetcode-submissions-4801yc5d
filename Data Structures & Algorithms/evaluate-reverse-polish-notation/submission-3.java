class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                if (stack.size() < 2) {
                    return 0;
                }


                int val1 = stack.pop();
                //int val1 = stack.pop();
                int val2 = stack.pop();

                switch (tokens[i]) {
                    case "+":
                        stack.push(val1 + val2);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "*":
                        stack.push(val1 * val2);
                        break;
                    case "/":
                        stack.push(val2 / val1);
                        break;
            } 
            }else {
                stack.push(Integer.parseInt(tokens[i]));

            }
        }
        return stack.pop();
    }
}


