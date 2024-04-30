public class CircularQueue{
    int[] q = new int[10];
    int front, rear;

    public CircularQueue(){
        front = rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public void enqueque(int x){
        if(isEmpty()){
            front = rear = 0;
            q[rear] = x;
        }
        else{
            rear = rear + 1;
            if(front == rear){
                System.out.println("Queue is full. Dequeue to continue");
                rear = rear - 1;
                return;
            }
            else{
                if(rear == q.length){
                    rear = 0;
                    q[rear] = x;
                }
                else{
                    q[rear] = x;
                }
            }
        }
    }
    public int dequeue()throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("This queue is empty.");
        }
        int item = q[front];
        if(front == rear){
            front = rear = -1; //Empty again
        }
        else if(front + 1 == q.length){     
            front = 0;
        }
        else{
            front = front + 1;
        }
        return item;
           
    }
}