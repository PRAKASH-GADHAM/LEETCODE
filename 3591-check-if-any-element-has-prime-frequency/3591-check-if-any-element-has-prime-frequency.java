class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>() ;

        for(int num : nums){
            hash.put(num , hash.getOrDefault(num , 0) + 1) ;
        }

        for(int value : hash.values()){
            if(isPrime(value)){
                return true ;
            }
        }
        return false ;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false ;
        if (n <= 3) return true ;
        if ((n & (n - 1)) == 0) return false ;

        for(int i = 3 ; i * i <= n ; i+=2){
            if(n % i == 0){
                return false ;
            }
        }
        return true ;
    }
}