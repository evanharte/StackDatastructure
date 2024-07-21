public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    //Check if it is empty
    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    // implement pop method
    public void pop(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
        } else {
            arr[topOfStack] = 0;
            topOfStack--;
            System.out.println("The value is successfully removed");
        }
    }

    // implement peek method
    public void peek(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[topOfStack]);
        }
    }

    // implement delete stack
    public void deleteStack() {
        if (topOfStack == -1){
            System.out.println("No stack to delete.");
        } else {
            for (int i = topOfStack; i > -1; i--){

            }
        }
    }

    // display stack
    public void displayStack(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.print("[ ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println("]");
        }
    }

    //implement pop method
    //implement peek
    //implement delete a stack
    //use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar
    //Implement a stack datastructure using LinkedList instead of Arrays

}