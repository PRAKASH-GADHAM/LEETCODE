class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1 ;
        while(i <= n){
            int first = i ;
            int last = n - i ;
            if(isValid(first) && isValid(last)){
                return new int[]{first , last} ;
            }
            i++ ;
        }
        return new int[]{} ;
    }

    private boolean isValid(int n) {
        while(n > 0){
            if(n % 10 == 0){
                return false ;
            }
            n /= 10 ;
        }
        return true ;
    }
}