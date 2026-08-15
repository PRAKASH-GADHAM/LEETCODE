class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer , Integer> hash = new HashMap<>() ;
        int num = n ;
        while(num > 0){
            int rem = num % 10 ;
            hash.put(rem , hash.getOrDefault(rem , 0) + 1) ;
            num /= 10 ;
        }
        int sum = 0 ;

        for(int key : hash.keySet()){
            sum += key * hash.get(key) ;
        }
        return sum ;
    }
}