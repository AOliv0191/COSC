public class BNodePractice {
    public static void main(String[] args) {
        BNode c = new BNode("C");
        BNode o = new BNode("O");
        BNode m = new BNode("M", c, o);
        BNode p = new BNode("P", m, null);
        BNode e = new BNode("E");
        BNode r = new BNode("R", e, null);
        BNode t = new BNode("T");
        BNode l = new BNode("L", t, r);
        BNode u = new BNode("u");
        BNode a = new BNode("A", u, l);
        BNode n = new BNode("N", null, a);
        BNode d = new BNode("D", p, n);
        
        
    }
    //post-order: left right root
    public static void postOrder(BNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value + " ");
        }
    }
    //in-order: left root right
    public static void inOrder(BNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.value + " ");
            inOrder(root.right);
        }
    }
    //pre-order: root left right
    public static void preOrder(BNode root){
        if(root != null){
            System.out.println(root.value + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }
}
