//class Node {
//    int val;
//    Node left;
//    Node righ;
//    Node(int val){
//        this.val = val;
//    }
//}
public class MirrorBT {
    public static void mirror(Node root) {
        // code here
        if(root == null) return;
        Node helper = root.left;
        root.left = root.right;
        root.right = helper;
        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
//                        3
//                 4           2
//             -1    1       6   9

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        mirror(a);
        System.out.println();


    }
}
