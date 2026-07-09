class Solution {
    public double myPow(double x, int n) {
        double res = 1.00d ;
        if(n == 0 || x == 1d){
            res = 1.00d ;
        }
        else if(x == -1d){
            if(n % 2 == 0){
                res = 1.00d ;
            }
            else{
                res = -1.00d ;
            }
        }
        else if(n <= Integer.MIN_VALUE || n >= Integer.MAX_VALUE){
            res = 0.00d ;
        }
        else if(n < 0){
            while(n != 0){
                res /= x ;
                n++ ;
            }
        }
        else{
            while(n != 0){
                res *= x ;
                n-- ;
            }
        }

        return res ;    
    }
}