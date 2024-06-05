class MinStack {

    public List<int[]> stack;
    int lastIndex = -1;
    public MinStack() {
        this.stack = new ArrayList();
    }
    
    public void push(int val) {
        int min; 
         if (stack.isEmpty()) {
            min = val;
        } else {
            min = Math.min(val,getMin());
        }
        
        stack.add(new int[]{val, min});
        lastIndex++;
    }
    
    public void pop() {
        stack.remove(lastIndex);
        lastIndex--; 
    }
    
    public int top() {
        return stack.get(lastIndex)[0];
    }
    
    public int getMin() {
        return stack.get(lastIndex)[1];
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