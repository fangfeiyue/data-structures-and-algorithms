import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            }else {
                if (stack.isEmpty())
                    return false;

                char topChar = stack.pop();

                if (c == ')' && topChar != '(')
                    return false;
                else if (c == ']' && topChar != '[')
                    return false;
                else if (c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}