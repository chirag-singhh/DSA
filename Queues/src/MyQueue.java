
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class MyQueue {
    Node head;
    Node tail;
    int size;

    void add(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int remove() {
        if (size == 0) {
            System.out.println("Error queue is null");
            return -1;
        } else {
            int front = head.val;
            head = head.next;
            size--;
            return front;
        }
    }
    int peek() {
        if (size == 0) {
            System.out.println("Error queue is null");
            return -1;
        } else {
            return head.val;
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
