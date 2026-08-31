class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return new int[]{-1, -1} ;

        ListNode PREV = head ;
        ListNode CURR = head.next ;
        ListNode NEXT = CURR.next ;
        int index = 1 ;
        int firstCritical = -1 ;
        int CurrCritical = -1 ;
        int minDistance = Integer.MAX_VALUE ;

        while(NEXT != null){
            boolean isCritical = (CURR.val > PREV.val && CURR.val > NEXT.val) || (CURR.val < PREV.val && CURR.val < NEXT.val) ;

            if(isCritical){
                if(firstCritical == -1){
                    firstCritical = index ;
                }
                else{
                    minDistance = Math.min(minDistance,index - CurrCritical) ;
                }
                CurrCritical = index ;
            }
            PREV = CURR ;
            CURR = NEXT ;
            NEXT = NEXT.next ;
            index++ ;
        }
        if(firstCritical == CurrCritical) return new int[]{-1, -1} ;
        int maxDistance = CurrCritical - firstCritical ;
        return new int[]{minDistance, maxDistance} ;
    }
}