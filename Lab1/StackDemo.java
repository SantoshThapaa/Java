package Lab1;
// Define an integer stack interface.
interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item
}

// Implement the IntStack interface with an array-based stack
class FixedStack implements IntStack {
    private int[] stack;
    private int top;

    // Constructor to initialize the stack
    public FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    // Implement the push method
    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[++top] = item;
        }
    }

    // Implement the pop method
    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow.");
            return -1;
        } else {
            return stack[top--];
        }
    }
}

// Test the stack implementation
public class StackDemo {
    public static void main(String[] args) {
        FixedStack stack = new FixedStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Outputs 30
        System.out.println(stack.pop()); // Outputs 20
        System.out.println(stack.pop()); // Outputs 10
    }
}
