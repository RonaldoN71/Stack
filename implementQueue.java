class Queue {
    int [] arr;
    int front;
    int rear;
    int n;
    int size;

    public Queue(int size ){
        this.size= size;
        arr = new int[size];
        front = -1;
        rear = -1;
        size = 0;
        n = 0;
    }
   void enqueue(int item){
    if(n==size){
        System.out.println("Overflow");
        return;
    }
    if(front == -1 && rear == -1 ){
        front++;
        rear++;
        arr[rear] = item;
    }
    else{
        rear = (rear+1)%size;
        arr[rear] = item;
    }
    n++;
   }
   void dequeue(){
    if(n==0){
        System.out.println("Underflow");
        return;
    }
    System.out.println("The pop: " + arr[front]);
    front = (front+1)%size;
    n--;
   }
   void display(){
    if(n==0){
        System.out.println("Underflow");
        return;
    }
    System.out.print("Queue: ");
    for(int i=front;i<=rear;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
}
public class implementQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.display();

    }
}
