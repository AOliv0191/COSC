public class BSTree {
    BNode root; 

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

    private BNode add(int x, BNode r){
        if(r == null){
            return new BNode(x);
        }

        if(x < r.value){
            r.left = add(x, r.left);
        }
        
        else{
            r.right = add(x, r.right);
        }

        return r;
    }

    public void printPreOrder(){
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(BNode r){
        if(r != null){
            System.out.print(r.value + " ");
            printPreOrder(r.left);
            printPreOrder(r.right);
        }
    }

    public void printInOrder(){
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(BNode r){
        if(r != null){
            printInOrder(r.left);
            System.out.print(r.value + " ");
            printInOrder(r.right);
        }
    }

    public void printPostOrder(){
        printPostOrder(root);
        System.out.println();
    }
    private void printPostOrder(BNode r){
        if(r != null){
            printPostOrder(r.left);
            printPostOrder(r.right);
            System.out.print(r.value + " ");
        }
    }

    public int findMin(){
        return findMin(root);
    }

    private int findMin(BNode r){
        if(r == null){
            return 0;
        }
        if (r.left == null) {
            return r.value;
        }
        return findMin(r.left);
    }

    public int findMax(){
        return findMax(root);
    }

    private int findMax(BNode r){
        if(r == null){
            return 0;
        }
        if (r.right == null) {
            return r.value;
        }
        return findMax(r.right);
    }
}
