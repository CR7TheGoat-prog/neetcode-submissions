class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.empty()) return false;
                char top = st.pop();
                if (!isBrackets(top, c)) return false;
            }
        }
        return st.isEmpty();
    }

    public boolean isBrackets(char a, char b) {
        return a == '(' && b == ')' ||
                a == '{' && b == '}' ||
                a == '[' && b == ']';
    }
}

