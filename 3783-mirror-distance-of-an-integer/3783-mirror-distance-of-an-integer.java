class Solution {
    public int mirrorDistance(int n) {
        int num = n ;
        int res = 0 ;

        while(num > 0){
            res = res * 10 + num % 10 ;
            num /= 10 ;
        }
        return Math.abs(n - res) ;
    }
}