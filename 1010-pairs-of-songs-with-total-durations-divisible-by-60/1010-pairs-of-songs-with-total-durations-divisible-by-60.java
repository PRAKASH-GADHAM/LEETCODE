class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0 ;
        int[] remainder = new int[60] ;

        for(int i = 0 ; i < time.length ; i++){
            int rem = time[i] % 60 ;
            int complement = (60 - rem) % 60 ;
            count += remainder[complement] ;
            remainder[rem]++ ;
        }
        return count ;
    }
}