class Node {
    int val;
    Node left;
    Node righ;
    Node(int val){
        this.val = val;
    }
}
public class Implement {
    public  static  void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.righ);

    }

    public  static  int size(Node root){
        if(root == null) return 0;
        return (1+size(root.left)+size(root.righ));
    }
    public  static  int sumOfTree(Node root){

        if(root == null) return 0;
        int leftsum = sumOfTree(root.left);
        int rightsum = sumOfTree(root.righ);

        return root.val+leftsum+rightsum;
    }
    public  static  int maxOfTree(Node root){

        if(root == null) return Integer.MAX_VALUE;
        int leftmax = maxOfTree(root.left);
        int rightmax = maxOfTree(root.righ);

        return Math.max(root.val,Math.max(leftmax,rightmax));
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
        a.righ = c;
        b.left = d;
        b.righ = e;
        c.left = f;
        c.righ = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sumOfTree(a));
        System.out.println(maxOfTree(a));

    }
}
