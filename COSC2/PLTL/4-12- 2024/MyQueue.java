public class MyQueue{
    Node front, rear;

    public MyQueue(){
        front = rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(String x){
        Node n = new Node(x);
        if(isEmpty()){
            front = rear = n;
        }
        else{
            rear.next = n;
            rear = rear.next;
        }
    }
    
    public String dequeue()throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("This queue is empty");
        }
        Node n = front;

        front = front.next;

        return n.value;
    }

    public String peek() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("This queue is empty");
        }
        else{
            return front.value;
        }
    }
}