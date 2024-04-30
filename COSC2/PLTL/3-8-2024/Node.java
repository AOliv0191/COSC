public class Node {
    String data;
    Node next;

    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(String data){
        this(data, null);
    }
    
    /**toString()
     * This method returns a String representation of a list starting
     * from the current Node.
     * It separates the Nodes with an arrow "->".
     * @return a String representation of the linked list.
     */
    public String toString() {
        if(next != null){
            return data + " -> " + next;
        }
        return data;
    }
}
