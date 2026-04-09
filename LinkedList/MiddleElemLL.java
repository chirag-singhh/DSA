class Node{ //user defined Data type
    int val; // default null
    Node next; // null 
    public Node(int val) {
        this.val = val;
    }
    
}

class LLs{ //user defined DS
    Node head;  //null
    Node tail;  // null

     void addAtHead(int val){
         Node temp = new Node(val);
         if (head==null) {
            head = tail = temp;
         }
         else{
         temp.next = head; //connect kro
         head= temp;       //forward kro
         }
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
    }

   
    
    int length(){
        Node temp = head;
        int len = 0;
       while(temp != null){
        temp = temp.next;
        len++;
       }
       return len;
    }
    

}

public class MiddleElemLL {
    public static void main(String[] args) {
         LLs l1= new LLs();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtHead(21);

        
        System.out.println(l1.length());

        
    }
}


/*
https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
 GFG MIDDLE ELEMENT QUESTION
 class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp = head;
        int len = 0;
        while(temp != null){
        temp = temp.next;
        len++;
       }
       
       temp = head;
       for(int i = 0 ; i < len/2;i++){
           temp = temp.next;
       }
       return temp.data;
    }
}

*/