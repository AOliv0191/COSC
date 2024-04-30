public class MyQueue {
    Node front, rear;

    public MyQueue(){
        front = rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(String s){
        Node n = new Node(s);
        if(isEmpty()){
            front = rear = n;
        }
        else{
            rear.next = n;
            rear = rear.next;
        }
    }

    public String peek() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("This queue is empty");
        }
        else{
            return front.value;
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
}
