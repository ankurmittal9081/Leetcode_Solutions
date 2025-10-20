// Last updated: 10/20/2025, 11:52:05 PM
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> complement = 
            new HashMap<Character, Character>();

        complement.put(')', '(');
        complement.put(']', '[');
        complement.put('}', '{');

        for (Character c : s.toCharArray()) {
            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty() || stack.pop() != complement.get(c)) {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }
}