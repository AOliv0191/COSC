public class MyLinkedList {
    Node first, last;
    public MyLinkedList(){
        first = last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }
    /*public boolean isEmpty(){
        if(first == null){
            return true;
        }
        else{
            return false;
        }
    } */
    /**
     * @param s
     */
    public void add(String s){
        Node n = new Node(s);
        if(isEmpty()){
            first = last = n;
        }
        else{
            last.next = n;
            last = last.next;
        }
    }
    public void print(){
        print(first);
    }

    private void print(Node n){
        while (n != null) {
            System.out.print(n.value + "\t");
            n = n.next;
        }
        System.out.println();
    }
    /*private void printRecursive(Node n){
        if(n != null){
            System.out.print(n.value + "\t");
            printRecursive(n.next);
        }
        else{
            System.out.println();
        }
    } */
    public int size(){
        return size(first);
    }
    private int size(Node n){
        int size = 0;
        while(n != null){
            size++;
            n = n.next;
        }
        return size;
    }
    /*private int sizeRecursive(Node n){
        if(n != null){
            return 1 + size(n.next);
        }
        else{
            return 0;
        }
    } */

    public boolean find(String s){
        return find(s, first);
    }

    private boolean find(String s, Node n){
        if(n == null){
            return false;
        }
        else if(n.value.equals(s)){
            return true;
        }
        else{
            return find(s, n.next);
        }
    }

    public void addAt(int index, String s){
        //1. avoid error
        if(index < 0 || index > size()){
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        //2. Add at the begining
        if (index == 0){
            first = new Node(s, first);
            if (last == null){
                last = first;
            }
            return;
        }

        //3. Somewhere in the list
        Node p  = first;
        for(int k = 1; k <= index - 1; k++){
            p = p.next;
        }

        //reroute position
        p.next = new Node(s, p.next);

        //4. Add at the end
        if(p.next.next == null){
            last = p.next;
        }
    }
}
