class Solution {
    public long sumAndMultiply(int n) {
        long res = 0L ;
        long sum = 0L ;

        while(n > 0){
            if(n % 10 > 0){
                res = res * 10 + n % 10 ;
            }
            sum += n % 10 ;
            n /= 10 ;
        }

        long result = 0L ;

        while(res > 0){
            result = result * 10 + res % 10 ;
            res /= 10 ;
        }
        return result * sum ;
    }
}