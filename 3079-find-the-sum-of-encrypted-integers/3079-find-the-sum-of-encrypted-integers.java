class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i] ;
            int currentsum = maxDigit(n) ;
            sum += currentsum ;
        }
        return sum ;
    }
    
    public int maxDigit(int n) {
        int max = 0;
        int digits = 0;

        while(n > 0){
            int digit = n % 10 ;
            max = Math.max(max, digit) ;
            digits++ ;
            n /= 10 ;
        }
        int result = 0;

        for(int i = 0; i < digits; i++){
            result = result * 10 + max ;
        }
        return result ;
    }
}