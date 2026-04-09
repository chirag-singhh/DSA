public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode tempA = A;
        ListNode tempB = B;
        ListNode tempC = new ListNode(-1); // dummy
        ListNode dummy = tempC; //travell krega
        if(tempA == null && tempB == null) return null;
        if(A == null) return B;
        if(B == null) return A;
        while(tempA !=null && tempB !=null){
            if(tempA.val <= tempB.val) {
                dummy.next = tempA;
                tempA = tempA.next;
                dummy= dummy.next;
            }else {
                dummy.next = tempB;
                tempB = tempB.next;
                dummy= dummy.next;
            }
        }
        if(tempA == null) dummy.next = tempB;
        else dummy.next = tempA;
        return tempC.next;
    }
} 
