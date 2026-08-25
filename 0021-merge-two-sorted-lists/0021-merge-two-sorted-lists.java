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
    ListNode newhead = new ListNode(0) ;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null ;
        if(list1 == null && list2 != null) return list2 ;
        if(list1 != null && list2 == null) return list1 ;

        if(list1.val <= list2.val){
            newhead.next = list1 ;
            inSertion(newhead.next , list1.next , list2) ;
        }
        else{
            newhead.next = list2 ;
            inSertion(newhead.next , list1 , list2.next) ;
        }
        return newhead.next ;
    }

    public void inSertion(ListNode node, ListNode list1, ListNode list2){
        if(list1 == null && list2 == null) return ;
        if(list1 == null && list2 != null){
            node.next = list2 ;
            return ;
        }
        if(list1 != null && list2 == null){
            node.next = list1 ;
            return ;
        }

        if(list1.val <= list2.val){
            node.next = list1 ;
            inSertion(node.next , list1.next , list2) ;
        }
        else{
            node.next = list2 ;
            inSertion(node.next , list1 , list2.next) ;
        }
    }
}