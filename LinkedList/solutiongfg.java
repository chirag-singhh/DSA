// https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */
// normal approach

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
        // Your code here
        int len=0;
        Node temp = head;
        
        while(temp !=null){
            temp = temp.next;
            len++;
        }
        
        if (k > len) return -1;
        temp = head;
        int x = (len-k+1);
        for(int i = 1;i<x;i++){
            temp = temp.next;
        } 
        
        return temp.data;
    }
}



//correct code optimal

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
        // Your code here
        Node slow=head;
        Node fast = head;
        //fast ksteps aage
        for(int i = 0 ; i < k ; i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}