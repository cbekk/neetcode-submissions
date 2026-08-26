class Solution {
    int size = 0;
    char[] stack;

    public boolean isValid(String s) {
        char top = 0;
        stack = new char[s.length()];
        size = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == ')' || current == '}' || current == ']') {
                if (size == 0) {
                    return false;
                }
                top = pop();
                if (current == ')' && top != '(') {
                    return false;
                }
                if (current == '}' && top != '{') {
                    return false;
                }
                if (current == ']' && top != '[') {
                    return false;
                }
            } else {
                push(current);
            }
        }
        return size == 0;
    }

    public char[] push(char c) {
        stack[size] = c;
        size++;
        return stack;
    }

    public char pop() {
        size--;
        return stack[size];
    }
}
