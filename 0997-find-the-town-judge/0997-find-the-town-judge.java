class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] hash = new int[n + 1] ;
        int[] hashed = new int[n + 1] ;

        for(int i = 0 ; i < trust.length ; i++){
            int person = trust[i][0] ;
            int trusted = trust[i][1] ;
            hash[person]++ ;
            hashed[trusted]++ ;
        }

        for(int i = 1 ; i <= n ; i++){
            if(hash[i] == 0 && hashed[i] == n - 1){
                return i ;
            }
        }
        return -1 ;
    }
}