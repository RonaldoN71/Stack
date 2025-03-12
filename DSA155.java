public class DSA155 {
    static void Reverse(Queue q){
        if(q.n==0){
            return;
        }

        int item = q.arr[q.front];
        q.dequeue();
        Reverse(q);
        q.enqueue(item);

    }
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        Reverse(queue);
        queue.display();

    }
}
