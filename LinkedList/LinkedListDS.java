class Node{ //user defined Data type
    int val; // default null
    Node next; // null 
    public Node(int val) {
        this.val = val;
    }
    
}

class LL{ //user defined DS
    Node head;  //null
    Node tail;  // null
    int size;

     void addAtHead(int val){
         Node temp = new Node(val);
         if (head==null) {
            head = tail = temp;
         }
         else{
         temp.next = head; //connect kro
         head= temp;       //forward kro
         }
         size++;
    }

    void addAtTail(int val){
         Node temp = new Node(val);
         if (tail==null) {
            head = tail = temp;
         }
         else{
         tail.next = temp;
         tail= temp;
         }
         size++;
    }

     void deleteatHead(){
         if (head == null) {
            System.out.println("LIST IS EMPTY");
         }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }
    
    void insert(int val,int idx){
        if(idx <0 || idx > size){
            System.out.println("Invalid index");
            return;
        }
        if(idx == 0) addAtHead(val);
        else if(idx ==size) addAtTail(0);
        else{
            Node temp = head;
            for(int i = 0 ; i < idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
         
    }

    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) { 
            if (temp.val == val) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void display(){
        if(head==null) return;
        Node temp = head;
        while (temp != null) { 
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
        
    }
    
    int get(int idx){
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void delete(int idx){
            if(idx < 0 || idx>size){
                System.out.println("invalid");
                return;
            }
            if(idx ==0) deleteatHead();
           Node temp = head;
            for(int i = 0 ; i < idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next; // delete
            if(idx == size-1) tail= temp; //we are deleting tail
            size--;
    }
    //leetcode question hai delete from middle
    int middle(){

        Node slow = head;
        Node fast = head;
        Node temp = head;
        Node t ;
        int idx = 0;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            idx++;
        }
        for (int i = 0; i < idx-1; i++) {
            temp=temp.next; 
        }
        t = temp.next.next;
        temp.next = t;
        display();
        return idx;
    }

    
}

    


public class LinkedListDS {
    public static void main(String[] args) {
        LL l1= new LL();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(50);


        // l1.display();
        // l1.addAtHead(100);
        l1.display();
        // System.out.println(l1.size);
        // int x = l1.search(30);
        // System.out.println(x);
        // l1.insert(500, 3);
        // l1.display();
        // System.out.println(l1.get(3));
        // l1.delete(3);
        // l1.display();
        // l1.search(22);
        System.out.println(l1.middle());
        


    }
}
