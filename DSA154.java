class Queue{
    int [] arr;
    int front;
    int rear;
    int size;
    int n;
    public Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
        n=0;
    }
    void push(int item){
       if(front == -1 && rear ==-1) {
        front++; rear++;
        arr[rear] = item;
       }
       else{
        rear = (rear+1)%size;
        arr[rear] = item;
       }
       n++;
    }
    void pop(){
        front = (front+1) % size;
        n--;
    }
    
    
}
public class DSA154 {

    static void swap(Queue q1, Queue q2) {
        for (int i = 0; i < q2.n; i++) {
            q1.arr[i] = q2.arr[i]; // Direct copy from q2 to q1
        }
    
        // Update q1's indices and count
        q1.n = q2.n;
        q1.front = 0;
        q1.rear = q2.n - 1;
    
        // Clear q2 completely
        q2.n = 0;
        q2.front = -1;
        q2.rear = -1;
    }
    
   static void StackImp(Queue q1,Queue q2,int item){
        q2.push(item);
        while(q1.n!=0){
            q2.push(q1.arr[q1.front]);
            q1.pop();
        }
        swap(q1,q2);

    }
    static void displayQueue(Queue q){
        System.out.print("Queue: ");
        for(int i = q.front;i<=q.rear;i++){
            System.out.print(q.arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Queue q1 = new Queue(3);
        Queue q2 = new Queue(3);
        StackImp(q1,q2,1);
        StackImp(q1,q2,2);
        StackImp(q1,q2,3);
        displayQueue(q1);
    }
}
