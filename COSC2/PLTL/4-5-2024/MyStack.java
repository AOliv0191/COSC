public class MyStack{
    public String[] stack;
    public int top;

    public MyStack(){
        stack = new String[2];
        top = 0;
    }
    
    /** push(String x)
     * This metho adds a new String x to the top of the stack.
     * If the stack is full, it dynamically increases its capacity
     * using ensureCapacity(). The String x is assign to the
     * current top position in the stack, and the top index is
     * incremented.
     * @param x The string element to be added to the stack.
     */
    public void push(String x){
        ensureCapacity();
        this.stack[this.top] = x;
        this.top += 1;
    }

    /** ensureCapacity()
     * This private method is used to ensure that the stack
     * has enough capacity to accommodate new elements by
     * doubling its size when it becomes full.
    */
    private void ensureCapacity(){
        int length = this.stack.length;
        if(this.top == (length - 1)){
            length = length * 2;
            String[] holderStack = new String[length];
            for(int i = 0; i < this.stack.length; ++i){
                holderStack[i] = this.stack[i];
            }
            this.stack = holderStack;
        }
    }
    /** pop()
     * This method removes and returns to the top string
     * element from the stack.
     * If the stack is empty, it throws a StackEmptyException
     * with an appropiate message.
     * @return The string element removed from the top of the stack
     * @throws StackEmptyException If the stack is empty when
     * attempting to pop an element.
    */
    public String pop() throws StackEmptyException{
        if(this.top == 0){
            throw new StackEmptyException();
        }
        this.top = this.top - 1;
        String str = this.stack[this.top];
        this.stack[this.top] = null;
        

        return str;
    }

    /** peek()
     * This method retrieves the top string element from the stack
     * without removing it.
     * If the stack is empty, it throws a StackEmptyException
     * with an appropiate message.
     * @return The string element removed from the top of the stack.
     * @throws StackEmptyException If the stack is empty when
     * attempting to peek.
     */
    public String peek() throws StackEmptyException{
        if(this.top == 0){
            throw new StackEmptyException();
        }
        this.top = this.top - 1;
        String str = this.stack[this.top];
        this.top = this.top + 1;

        return str;
    }
    
}