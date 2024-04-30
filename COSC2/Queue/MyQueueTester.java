public class MyQueueTester {
    public static void main(String[] args) {
        try{
            MyQueue q = new MyQueue();
        
            System.out.println(q.isEmpty());
            q.enqueue("Cuarteto");
            q.enqueue("Tapicero");
            q.enqueue("Hello");
            System.out.println(q.isEmpty());
            
            while(!q.isEmpty()){
                System.out.println("Eliminating: " + q.dequeue());
            }
        }
        catch(QueueEmptyException e1){
            System.out.println(e1);
        }

    }
}
