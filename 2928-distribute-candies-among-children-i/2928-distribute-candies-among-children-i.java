class Solution{
    public int distributeCandies(int n, int limit){
        int cnt = 0 ;

        for(int a = 0 ; a <= limit ; a++){
            for(int b = 0 ; b <= limit ; b++){
                int c = n - a - b ;
                if(c >= 0 && c <= limit){
                    cnt++ ;
                }
            }
        }
        return cnt ;
    }
}