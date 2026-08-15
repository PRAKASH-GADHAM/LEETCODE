class Solution {
    public boolean isFascinating(int n) {
        if(2 * n > 999 || 3 * n > 999) return false ;
        int res = n ;
        res = res * 1000 + 2 * n ;
        res = res * 1000 + 3 * n ;
        int[] freq = new int[10] ;

        while(res > 0){
            int rem = res % 10 ;
            if(rem == 0){
                return false ;
            }
            freq[rem]++ ;
            if(freq[rem] > 1){
                return false ;
            }
            res /= 10 ;
        }
        return true ;
    }
}