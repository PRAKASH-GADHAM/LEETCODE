class Solution {
    public boolean canAliceWin(int n) {
        int i = 0 ;
        int ten = 10 ;

        while(n - ten >= 0){
            n -= ten ;
            ten-- ;
            i++ ; 
        }
        return i % 2 != 0 ;
    }
}