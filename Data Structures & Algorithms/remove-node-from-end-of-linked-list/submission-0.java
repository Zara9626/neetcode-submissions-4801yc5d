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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;

        List<ListNode> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr!= null){
            arr.add(curr);
            curr = curr.next;
            System.out.println(head);
        }

        int resIndex = arr.size() - n;
        if( resIndex == 0){
            return head.next;
        }
        arr.get(resIndex-1).next = arr.get(resIndex).next;
       

        return head;

    }
}
