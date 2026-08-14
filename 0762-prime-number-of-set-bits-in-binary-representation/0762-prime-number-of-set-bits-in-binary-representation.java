class Solution {
    public int countPrimeSetBits(int left, int right) {
        int n = right ;
        int num = 0 ;

        while(right >= left){
            int count = 0 ;
            while(n != 0){
                n = n & (n - 1) ;
                count++ ;
            }
            if(count == 2 || count == 3 || count == 5 || count == 7 || count == 11 || count == 13 || count == 17 || count == 19 || count == 23 || count == 29){
                num++ ;
            }
            n = --right ;
        }
        return num ;
    }
}