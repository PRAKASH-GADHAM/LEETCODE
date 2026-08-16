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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head ;
        
        ListNode newNode = new ListNode(0) ;
        newNode.next = head ;

        ListNode current = newNode ;
        
        while(current.next != null && current.next.next != null){
            if(current.next.val == current.next.next.val){
                int duplicate = current.next.val ;
                while(current.next != null && current.next.val == duplicate){
                    current.next = current.next.next ;
                }
            } 
            else{
                current = current.next ;
            }
        }
        return newNode.next ;
    }
}