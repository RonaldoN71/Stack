class Stack{
    int [] arr ;
    int top;
    int capacity;

    public Stack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }
    void StackPush(int item){
        if(top== capacity-1){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = item;
    }
    void StackPop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println("Pop: "+ arr[top--]);

    }
    void displayStack(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class ImplementStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.StackPush(1);
        stack.StackPush(2);
        stack.StackPush(3);
        stack.StackPush(4);
        stack.StackPush(5);
        stack.StackPush(6);
        stack.displayStack();
        stack.StackPop();
        stack.StackPop();
        stack.displayStack();



        
    }
}