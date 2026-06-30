class Solution {
    public boolean isPowerOfTwo(int n) {
        int bool = 0 ;
        if(n == 0 || n == -1){
            return false ;
            }
        if(n < 0){
            bool = n & (n + 1);
        }
        else{
            bool = n & (n - 1);
        }
    return bool == 0 ; 
    }
}