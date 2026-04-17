class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Implement {
    public  static  void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }

    public  static  int size(Node root){
        if(root == null) return 0;
        return (1+size(root.left)+size(root.right));
    }
    public  static  int sumOfTree(Node root){

        if(root == null) return 0;
        int leftsum = sumOfTree(root.left);
        int rightsum = sumOfTree(root.right);

        return root.val+leftsum+rightsum;
    }
    public  static  int maxOfTree(Node root){

        if(root == null) return Integer.MAX_VALUE;
        int leftmax = maxOfTree(root.left);
        int rightmax = maxOfTree(root.right);

        return Math.max(root.val,Math.max(leftmax,rightmax));
    }

    public  static  int product(Node root){

        if(root == null) return 1;
        int leftmax = product(root.left);
        int rightmax = product(root.right);

        return root.val*leftmax*rightmax;
    }

    public  static  int level(Node root){

        if(root == null) return 0;
        int leftmax = level(root.left);
        int rightmax = level(root.right);

        return 1+Math.max(leftmax,rightmax);
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
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sumOfTree(a));
        System.out.println(maxOfTree(a));
        System.out.println(product(a));
        System.out.println(level(a));

    }
}
