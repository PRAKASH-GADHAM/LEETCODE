class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer , Integer> hash = new HashMap<>() ;
        while(n > 0){
            int num = n % 10 ;
            hash.put(num , hash.getOrDefault(num , 0) + 1) ;
            n /= 10 ;
        }

        int least = Integer.MAX_VALUE ;
        int minFreq = Integer.MAX_VALUE ;

        for(int key : hash.keySet()){
            int freq = hash.get(key) ;
            if(freq < minFreq){
                minFreq = freq ;
                least = key ;
            }
            else if(freq == minFreq && key < least){
                least = key ;
            }
        }
        return least ;
    }
}