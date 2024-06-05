class MinStack {

    public List<int[]> stack;
    public MinStack() {
        this.stack = new ArrayList();
    }
    
    public void push(int val) {
         if (stack.size() == 0) {
            stack.add(new int[]{val, val});
            return;
        } 
        stack.add(new int[]{val, Math.min(val,getMin())});
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1)[0];
    }
    
    public int getMin() {
        return stack.get(stack.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */