class Solution {
    public int countOdds(int low, int high) {
        int count_odd = 0 ;
        
        if(low % 2 == 0) low += 1 ;
        if(high % 2 == 0) high -= 1 ;

        while(low <= high){
            count_odd++ ;
            low += 2 ;
        }
        return count_odd ;
    }
}