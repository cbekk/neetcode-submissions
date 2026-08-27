class MinStack {
    List<Integer> stack = new ArrayList<>();
    List<Integer> mins = new ArrayList<>();

    public MinStack() {}

    public void push(int val) {
        int min;
        stack.add(val);
        if (!mins.isEmpty()) {
            min = Math.min(val, mins.get(mins.size() - 1));
        } else {
            min = Math.min(val, Integer.MAX_VALUE);
        }
        mins.add(min);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
        mins.remove(mins.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return mins.get(mins.size() - 1);
    }
}
