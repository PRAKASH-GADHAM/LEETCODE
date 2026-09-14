class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0] ;
        int y1 = rec1[1] ;
        int x2 = rec1[2] ;
        int y2 = rec1[3] ;
        int i1 = rec2[0] ;
        int j1 = rec2[1] ;
        int i2 = rec2[2] ;
        int j2 = rec2[3] ;

        if((x1 < i2 && x2 > i1) && (y1 < j2 && y2 > j1)){
            return true ;
        }
    
        return false ;
    }
}