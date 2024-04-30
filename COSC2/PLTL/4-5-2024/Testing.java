public class Testing {
    public static void main(String[] args) {
        MyStack holder = new MyStack();
        holder.push("Hijo de Hernandez");
        try {
            String str = holder.peek();
            System.out.println(str);
            System.out.println(holder.top);
        } catch (StackEmptyException e) {
        }
    }
}
