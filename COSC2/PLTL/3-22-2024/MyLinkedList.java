public class MyLinkedList {
    Node first, last;

    public MyLinkedList(){
        first = last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    //implement add(), size(), and find()

    /** add()
     * This method adds a new Node with the given data at
     * the end of the linked list.
     * @param x the data to be added to the new Node.
     */
    public void add(String x){
        Node n = new Node(x);
        //empty
        if(isEmpty()){
            first = last = n;
        }
        //no empty
        else{
            last.next = n;
            last = last.next;
        }
    }

    /** size()
     * This method calculates and returns the size of the
     * linked list by calling a private method size(Node n)
     * with the first node as the starting point.
     * @return 
     */
    public int size(){
        return size(first);
    }

    private int size(Node n){
        if(n == null){
            return 0;
        }
        else{
            return 1 + size(n.next);
        }
    }

    /**find()
     * This method searches for a given String x in the 
     * linked list by calling the privates method 
     * find(String x, Node n) with the first node as the 
     * starting point.
     * @param x the data to be searched in the linked list.
     * @return true if the String x is found in the linked
     * list, otherwise false (a boolean value).
     */
    public boolean find(String x){
        return find(x, first);
    }

    private boolean find(String x, Node n){
        if(n == null){
            return false;
        }
        else if(n.data.equals(x)){
            return true;
        }
        else{
            return find(x, n.next);
        }
    }
}
