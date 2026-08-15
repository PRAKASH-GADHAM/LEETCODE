class Solution {
    public int alternateDigitSum(int n) {
        int digits = String.valueOf(n).length() ;

        if(digits % 2 == 0){
            return digitSum(n , -1) ;
        }
        else{
            return digitSum(n , 1) ;
        }
    }

    public int digitSum(int n , int i){
        int sum = 0 ;

        while(n > 0){
            sum += (n % 10) * i ;
            i *= -1 ;
            n /= 10 ;
        }
        return sum ;
    }
}