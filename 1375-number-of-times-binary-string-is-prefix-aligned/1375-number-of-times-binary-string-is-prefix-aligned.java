class Solution {
    public int numTimesAllBlue(int[] flips) {
        int fliped = 0 ;
        int count = 0 ;

        for(int i = 0 ; i < flips.length ; i++){
            fliped = Math.max(fliped , flips[i]) ;
            if(fliped == i+1) count++ ;
        }
        return count ;
    }
}