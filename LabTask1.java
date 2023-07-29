interface Container {
    void iterateAndPrint();
    void push(int x);
    void pop();
    int top();
    boolean isFull();
    boolean isEmpty();
}
class Stack implements Container {
    private int stack[];
    private int top = -1;
    public Stack(int capacity) {
        stack = new int[capacity];
    }
    public void push(int x) {
        if(isFull()) throw new ArrayIndexOutOfBoundsException("stack is full");
        stack[++top] = x;
    }
    public void pop() {
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("stack is empty");
        --top;
    }
    public int top() {
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("stack is empty");
        return stack[top];
    }
    public boolean isFull() {
        if(top == stack.length - 1)
            return true;
        return false;
    }
    public boolean isEmpty() {
        if(top == -1)
            return true;
        return false;
    }
    public void iterateAndPrint() {
        while(!isEmpty()) {
            int x = top();
            System.out.println(x);
            pop();
        }
    }
}
class Queue implements Container {
    private int[] queue;
    private int front = 0, rear = 0;
    public Queue(int capacity) {
        this.queue = new int[capacity];
    }
    public void push(int x) {
        if(isFull()) throw new ArrayIndexOutOfBoundsException("queue is full");
        queue[rear++] = x;
    }
    public void pop() {
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("queue is empty");
        ++front;
    }
    public int top() {
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("queue is empty");
        return queue[front];
    }
    public boolean isFull() {
        if(rear == queue.length)
            return true;
        return false;
    }
    public boolean isEmpty() {
        if(front == rear)
            return true;
        return false;
    }
    public void iterateAndPrint() {
        while(!isEmpty()) {
            int x = top();
            System.out.println(x);
            pop();
        }
    }
}
public class LabTask1 {
    public static void main(String[] args) {
        Container queue = new Queue(5);
        Container stack = new Stack(4);
        try {
            for(int i = 1; i <= 5; ++i)
                queue.push(i);
            queue.iterateAndPrint();            
            for(int i = 1; i <= 4; ++i)
                stack.push(i);
            stack.iterateAndPrint();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}