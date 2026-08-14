class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] hash = new int[10001] ;

        for(int card : deck){
            hash[card]++ ;
        }
        
        int gcd = 0 ;

        for(int freq : hash){
            if(freq > 0){
                gcd = findGCD(gcd, freq) ;
            }
        }
        return gcd >= 2 ;
    }

    private int findGCD(int a, int b) {
        while(b != 0){
            int temp = a % b ;
            a = b ;
            b = temp ;
        }
        return a ;
    }
}