public class NodeTester {
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");

        n2.next = n1;
        n1.next = n3;
        n3.next = n5;
        n5.next = n4;

        System.out.println("print():");
        print(n2);

        System.out.println("printRecursive():");
        printRecursive(n2);
        System.out.println();

        System.out.println("toString():");
        System.out.println(n2);
    }
    
    /** print()
     * This method prints the data of a list starting from the given Node.
     * It separates the Nodes with an arrow "->".
     * @param n the starting Node.
     */
    public static void print(Node n){
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println();
    }

    /**printRecursive()
     * This method recursively prints the data of a list starting from the 
     * given Node. It separates the Nodes with and arrow "->".
     * @param n the starting Node.
     */
    public static void printRecursive(Node n){
        if(n.next == null) {
            System.out.print(n.data);
        }
        else{
            System.out.print(n.data + " -> ");
            printRecursive(n.next);
        }
    }
}
