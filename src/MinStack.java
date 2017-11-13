import java.util.Stack;
/**
 * Created by siweiwang on 2017-11-02.
 */
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.empty() || min.peek() >= x){
            min.push(x);
        }
    }

    public void pop() {
        if (this.top() == this.getMin()){
            min.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
