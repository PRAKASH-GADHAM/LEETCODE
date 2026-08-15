class Solution {
    public boolean validDigit(int n, int x) {
        int count = 0 ;

        while(n > 0){
            int rem = n % 10 ;
            if(n / 10 == 0 && n % 10 == x){
                return false ;
            }

            if(rem == x){
                count++ ;
            }
            n /= 10 ;
        }
        return count > 0 ? true : false ;
    }
}