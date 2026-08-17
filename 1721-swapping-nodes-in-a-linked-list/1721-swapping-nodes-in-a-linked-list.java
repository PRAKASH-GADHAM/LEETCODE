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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0 ;
        ListNode current = head ;

        while(current != null){
            n++ ;
            current = current.next ;
        }

        ListNode first = head ;

        for(int i = 1 ; i < k ; i++){
            first = first.next ;
        }

        ListNode second = head ;

        for(int i = 1 ; i <= n - k ; i++){
            second = second.next ;
        }

        int temp = first.val ;
        first.val = second.val ;
        second.val = temp ;
        return head ;
    }
}