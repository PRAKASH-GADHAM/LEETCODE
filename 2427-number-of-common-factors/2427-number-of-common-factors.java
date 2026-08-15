class Solution {
    public int commonFactors(int a, int b) {
        int gcd = gCd(Math.max(a , b) , Math.min(a , b)) ;
        int count = 0 ;

        for(int i = 1 ; i <= gcd ; i++){
            if(gcd % i == 0){
                count++ ;
            }
        }
        return count ;
    }

    public int gCd(int a , int b){
        while(b != 0){
            int temp = a % b ;
            a = b ;
            b = temp ;
        }
        return a ;
    }
}