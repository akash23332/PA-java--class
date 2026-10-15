package Stack;
import java.util.Stack;
public class lc155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public lc155() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

