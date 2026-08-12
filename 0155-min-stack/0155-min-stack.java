class MinStack {
    int[] stack ;
    int[] minStack ;
    int top = -1 ;

    public MinStack() {
        stack = new int[30000] ;
        minStack = new int[30000] ;
    }

    public void push(int value) {
        stack[++top] = value ;

        if(top == 0){
            minStack[top] = value ;
        }
        else{
            minStack[top] = Math.min(value, minStack[top - 1]) ;
        }
    }

    public void pop() {
        top-- ;
    }

    public int top() {
        return stack[top] ;
    }

    public int getMin() {
        return minStack[top] ;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */