/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {

        // logic: 
        // divide to half, second half should be reversed 
        // then merge
        
        // splitting to two halves

        ListNode l1 = head; //slow
        ListNode l2 = head; // fast

        while(l2 != null && l2.next!= null){
            l1 = l1.next;
            l2 = l2.next.next;
        }
        // reversing the other half;

        ListNode curr = l1.next;
        ListNode prev = l1.next = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        // merging two lists;

        ListNode first = head;
        curr = prev;

        while(curr !=null){
            ListNode temp1 = first.next;
            ListNode temp2 = curr.next;
            first.next = curr;
            curr.next = temp1;
            first = temp1;
            curr = temp2;
        }


            
        
        


        
    }
}
