/**
 * Definition for singly-linked list.
 * public class ListNode{
 *     int val ;
 *     ListNode next ;
 *     ListNode(){}
 *     ListNode(int val){ this.val = val ; }
 *     ListNode(int val, ListNode next){ this.val = val ; this.next = next ; }
 * }
 */
class Solution{
    public ListNode removeZeroSumSublists(ListNode head){
        ListNode newNode = new ListNode(0) ;
        newNode.next = head ;
        HashMap<Integer, ListNode> hash = new HashMap<>() ;
        int sum = 0 ;
        ListNode current = newNode ;

        while(current != null){
            sum += current.val ;
            hash.put(sum, current) ;
            current = current.next ;
        }

        sum = 0 ;
        current = newNode ;

        while(current != null){
            sum += current.val ;
            current.next = hash.get(sum).next ;
            current = current.next ;
        }
        return newNode.next ;
    }
}