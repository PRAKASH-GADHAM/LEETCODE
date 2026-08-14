class Solution {
    public int sumBase(int n, int k) {
        int knum = base(n , k) ;
        int sum = 0 ;

        while(knum > 0){
            sum += knum % 10 ;
            knum /= 10 ;
        } 
        return sum ;
    }
    private int base(int n, int k) {
        int result = 0 ;
        int place = 1 ;

        while(n > 0){
            int digit = n % k ;
            result += digit * place ;
            place *= 10 ;
            n /= k ; 
        }
        return result ;
    }
}