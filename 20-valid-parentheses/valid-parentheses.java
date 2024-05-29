class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); 
            } else {
                if (stack.empty()) return false; 
                char last = stack.pop(); 
                if (ch == ')' && last != '(') return false; 
                if (ch == '}' && last != '{') return false; 
                if (ch == ']' && last != '[') return false; 
            }
        }
        if (!stack.empty()) return false; 
        return true; 
    }
}