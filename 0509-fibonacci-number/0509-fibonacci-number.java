class Solution {
    public int fib(int n) {
        if(n <= 1 || n == 5){
            return n ;
        }
        if(n <= 4 && n > 1){
            return n-1 ;
        }
        else{
            return fib(n-1)+fib(n-2) ;
        }
        
    }
}