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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return head ;
        ListNode current = head ;
        int size = 0 ;
        
        while(current != null){
            current = current.next ;
            size++ ;
        }

        if(size == 1){
            ListNode newNode = new ListNode() ;
            head = newNode ;
            head = head.next ;
            return head ;
        }

        current = head ;

        for(int i = 0 ; i < size / 2 - 1 ; i++){
            current = current.next ;
        }

        current.next = current.next.next ;
        return head ;
    }
}