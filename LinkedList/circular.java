class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }

   
}
    


public class circular {

public static void main(String[] args) {

    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);
    Node f = new Node(60);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = a;

   print(a);

}

public static void print(Node head) {

    if (head == null) return;
    Node temp = head;
    do {
        System.out.print(temp.val + " ");
        temp = temp.next;
    } while (temp != head);
}


}