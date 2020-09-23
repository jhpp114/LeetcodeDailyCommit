import java.util.*;
class CustomStack {
    private int stack[];
    private int length;
    public CustomStack(int maxSize) {
        this.length = -1;
        stack = new int [maxSize];
    }
    
    public void push(int x) {
        if (stack.length -1 > length) {
            length++;
            stack[length] = x;
            return;
        }
        System.out.println("Fail to add");
        return;
    }
    
    public int pop() {
        if (length < 0) {
            return -1;
        } else {
            int poppedValue = stack[length];
            length -= 1;
            return poppedValue;
        }
    }
    
    public void increment(int k, int val) {
        if(k > stack.length) {
            for(int i = 0; i < stack.length; i++) {
                stack[i] += val;
            }
        } else {
            for(int i = k-1; i >= 0; i--) {
                stack[i] += val;
            }
        }   
    }


    public static void main(String[] args) {
        CustomStack myStack = new CustomStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(3);
        myStack.increment(3, 100);

        
  
        // System.out.println(myStack.pop());
        
        // myStack.increment(10, 100);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}



/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */