class Solution {
    public int numTimesAllBlue(int[] flips) {
        boolean[] prefix = new boolean[flips.length] ;
        int n = flips.length ;
        int count = 0 ;

        for(int i = 0 ; i < n ; i++){
            int flip = flips[i] ;
            prefix[flip - 1] = true ;  
            boolean found = true ;

            for(int j = 0 ; j <= i ; j++){
                if(!prefix[j]){
                    found = false ;
                    break ;
                }
            }

            if(found) count++ ;
        }
        return count ;
    }
}