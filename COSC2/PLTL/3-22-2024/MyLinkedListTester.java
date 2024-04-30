public class MyLinkedListTester {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println("Creating list...");
        System.out.println("isEmpty()?: " + list.isEmpty());
        System.out.println("Adding values...");
        list.add("Hello");
        list.add("World!");
        System.out.println("isEmpty()?: " + list.isEmpty());
        System.out.println("Size(): " + list.size());
        System.out.println("Is 'Hello' in the list? " + list.find("Hello"));
        
    }
}
