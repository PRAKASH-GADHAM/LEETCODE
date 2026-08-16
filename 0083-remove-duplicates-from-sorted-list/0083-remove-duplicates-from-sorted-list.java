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
        ListNode i = head ;
        
        while(i.next != null){
            ListNode j = i.next ;
            if(i.val == j.val){
                i.next = j.next ;
            }
            else{
                i = i.next ;
            }
        }
        return head ;
    }
}