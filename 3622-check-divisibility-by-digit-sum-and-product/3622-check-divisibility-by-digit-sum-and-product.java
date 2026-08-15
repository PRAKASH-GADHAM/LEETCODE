class Solution {
    public boolean checkDivisibility(int n) {
        if(n < 10) return false ;
        int product = 1 ;
        int sum = 0 ;
        int num = n ;

        while(num > 0){
            product *= num % 10  ;
            sum += num % 10 ;
            num /= 10 ;
        }
        return n % (product + sum) == 0 ;
    }
}