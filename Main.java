public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(7);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.displayStack();
        stackArrays.peek();
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.displayStack();
    }
}
