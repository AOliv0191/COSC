public class MyLinkedListTester {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();

        System.out.println("isEmpty(): " + list.isEmpty());

        list.add("Hello");
        list.add("Computer");
        list.add("Science");
        list.add("EPCC");

        System.out.println("isEmpty(): " + list.isEmpty());

        list.print();

        System.out.println(list.size());
    }
}
