class Solution {
    public int countEven(int num) {
        if(num < 2) return 0 ;

        int count = 0 ;

        for(int i = 2 ; i <= num ; i++){
            int sum = digits(i) ;

            if(sum % 2 == 0) count++ ;
        }
        return count ;
    }

    public int digits(int n){
        int sum = 0 ;

        while(n > 0){
            sum += n % 10 ;
            n /= 10 ;
        }
        return sum ;
    }
}