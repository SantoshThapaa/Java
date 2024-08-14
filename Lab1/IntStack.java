package Lab1;
// Define an integer stack interface.
interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item
}

// Simple stack implementation using an array
class SimpleStack implements IntStack {
    private int[] stack = new int[10]; // fixed size stack of 10 elements
    private int top = -1;

    // Implement the push method
    public void push(int item) {
        if (top < 9) { // check if stack is not full
            stack[++top] = item;
        } else {
            System.out.println("Stack is full.");
        }
    }

    // Implement the pop method
    public int pop() {
        if (top >= 0) { // check if stack is not empty
            return stack[top--];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
}

// Test the SimpleStack implementation
public class StackDemo {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Outputs 30
        System.out.println(stack.pop()); // Outputs 20
        System.out.println(stack.pop()); // Outputs 10
    }
}

