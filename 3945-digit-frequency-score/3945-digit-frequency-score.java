class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer , Integer> hash = new HashMap<>() ;
        int num = n ;
        int freq = 0 ;

        while(num > 0){
            int rem = num % 10 ;
            hash.put(rem , hash.getOrDefault(rem , 0) + 1) ;
            freq += rem ;
            num /= 10 ;
        }
        return freq ;
    }
}