public class BNodeInt{
    int value;
    BNodeInt left;
    BNodeInt right;

    public BNodeInt(int value){
        this.value = value;
        this.left = this.right = null;
    }

    public BNodeInt(int value, BNodeInt left, BNodeInt right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}