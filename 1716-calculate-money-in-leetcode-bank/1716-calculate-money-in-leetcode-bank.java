class Solution {
    public int totalMoney(int n) {
        int i = 1 ;
        int mon = 0 ;
        int res = 0 ;

        while(n != 0){
            res += i ;

            if((i - mon) % 7 == 0){
                mon++ ;
                i = 1 + mon ;
            }
            else{
                i++ ;
            }
            n-- ;
        }
        return res ;
    }
}