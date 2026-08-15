class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) return true ;

        int n = num ;
        int reverse = 0 ;

        while(n > 0){
            reverse = reverse * 10 + n % 10 ;
            n /= 10 ;
        }

        int doubleReversal = 0 ;

        while(reverse > 0){
            doubleReversal = doubleReversal * 10 + reverse % 10 ;
            reverse /= 10 ;
        }
        return doubleReversal == num ;
    }
}