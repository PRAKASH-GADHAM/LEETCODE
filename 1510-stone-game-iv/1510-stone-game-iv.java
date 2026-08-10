class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1] ;

        for(int stones = 1 ; stones < n + 1 ; stones++){
            for(int s = 1 ; s * s <= stones ; s++){
                if(!dp[stones - s * s]){
                    dp[stones] = true ;
                    break ;
                }
            }
        }
        return dp[n] ;
    }
}