public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    // Push
    public void push(int num) {
        Node newNode = new Node(num);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        }
        int num = top.num;
        top = top.next;
        return num;
    }

    // Peek
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        }
        System.out.println(top.num);
    }

    // Delete Stack
    public void delete() {
        while (top != null) {
            top = top.next;
        }
        System.out.println("Stack has been successfully deleted.");
    }

    // Is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Is Full
    public void isFull() {
        if (top.next == null) {
            System.out.println("Stack is full.");
            return;
        }
        System.out.println("Stack is not full.");
    }

    // Display stack
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.num + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.isEmpty();
        stack.isFull();
        stack.peek();
        stack.delete();
        stack.printStack();
    }
}
