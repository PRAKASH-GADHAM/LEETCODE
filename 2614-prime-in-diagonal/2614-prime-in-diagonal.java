class Solution {
    public int diagonalPrime(int[][] nums) {
        int largest_prime = 0 ;
        int n = nums.length - 1 ;

        for(int i = 0 ; i <= n ; i++){
            if(isPrime(nums[i][i])){
                largest_prime = Math.max(largest_prime , nums[i][i]) ;
            }
        }

        for(int i = 0 ; i <= n ; i++){
            if(isPrime(nums[i][n - i])){
                largest_prime = Math.max(largest_prime , nums[i][n - i]) ;
            }
        }
        return largest_prime ;
    }

    public boolean isPrime(int x) {
        if(x < 2){
            return false ;
        }

        for(int i = 2 ; i * i <= x ; i++){
            if(x % i == 0){
                return false ;
            }
        }
        return true ; 
    }
}