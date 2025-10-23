package tree;

public class RedBlackTreeDriver {
    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        rbt.insert(10);
        rbt.insert(18);
        rbt.insert(7);
        rbt.insert(15);
        rbt.insert(16);
        rbt.insert(30);
        rbt.insert(25);
        rbt.insert(60);
        rbt.insert(40);  
        System.out.println("In-order Traversal of Red-Black Tree:");
        rbt.inOrder();
    }
}
