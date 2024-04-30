public class NodeTester {
    public static void main(String[] args) {
        //B -> A-> C-> E-> D->
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");

        n2.next = n1;
        n1.next = n3;
        n3.next = n5;
        n5.next = n4;

        print(n2);

        printRecursive(n2);
    }
    public static void print(Node n){
        while (n != null) {
            System.out.print(n.value + "-> ");
            n = n.next;
        }
        System.out.println();
    }
    public static void printRecursive(Node n){
        System.out.print(n.value);

        if(n.next != null) {
            System.out.print("-> ");
            printRecursive(n.next);
        }
    }
}
