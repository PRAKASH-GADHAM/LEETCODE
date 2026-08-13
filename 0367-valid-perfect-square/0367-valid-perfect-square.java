class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true ;
        long i = 1 ;
        long j = num ;

        while(i <= j){
            long mid = (i + j) / 2 ;
            long square = mid * mid ;

            if(square == num){
                return true ;
            }
            else if(square > num){
                j = mid - 1 ;
            }
            else{
                i = mid + 1 ;
            }
        }
        return false ;
    }
}