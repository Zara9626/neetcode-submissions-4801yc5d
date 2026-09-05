class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String str : parts) {
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!str.equals("") && !str.equals(".")) {
                stack.push(str);
            }
        }
        return "/" + String.join("/", stack);
    }
}