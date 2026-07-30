class Solution {
    public int minimumPushes(String word) {
        int n = word.length() ;
        int total = 0 ;
        int push = 1 ;
        int c = n / 8 ;
        for (int i = 0 ; i < c ; i++) {
            total += push  * 8 ;
            push++ ;
        }
        
        int rem = n % 8;
        total += push * rem ;
        
        return total ;
    }
}