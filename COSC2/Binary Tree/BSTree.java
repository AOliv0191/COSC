public class BSTree {
    BNodeInt root; 

    public BSTree(){
        root = null;
    }
    
    public boolean isEmpty(){
        return root==null;
    }

    public boolean add(int x){
        root = add(x, root);

        return true;
    }

    private BNodeInt add(int x, BNodeInt r){
        //when the current code is null, we've reache a leaf Node
        // and we can insert the new node in that position
        if(r == null){
            return new BNodeInt(x);
        }

        //if the new node's vallue is longer than a current node, 
        //go to the left child:
        if(x < r.value){
            r.left = add(x, r.left);
        }
        //If the new's Node value is greater than a current node,
        //go to the right child:
        else{
            r.right = add(x, r.right);
        }

        return r;
    }
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(BNodeInt root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(BNodeInt root){
        if(root != null){
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public int size(){
        return size(root);
    }

    private int size(BNodeInt r){
        if(r == null){
            return 0;
        }
        else{
            return 1 + size(r.right) + size(r.left);
        }
    }
    
    public boolean contains(int target){
        return contains(target, root);
    }

    private boolean contains(int target, BNodeInt r){
        if(r == null){
            return false;
        }
        if(target == r.value){
            return true;
        }
        if(target < r.value){
            return contains(target, r.left);
        }
        else{
            return contains(target, r.right);
        }
    }

    public int numberOfLeaves(){
        return numberOfLeaves(root);
    }

    private int numberOfLeaves(BNodeInt r){
        if(r == null){
            return 0;
        }
        if((r.left == null) && (r.right == null)){
            return 1;
        }
        else{
            return numberOfLeaves(r.right) + numberOfLeaves(r.left);
        }
    }

    public int largest(){
        return largest(root);
    }
    private int largest(BNodeInt r){
        if(r == null){
            return 0;
        }
        if(r.right == null){
            return r.value;
        }
        return largest(r.right);
    }
    //height()
    //findMax()
    //
}
