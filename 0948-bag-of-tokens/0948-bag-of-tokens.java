class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens) ;
        int score = 0 ;
        int max_score = 0 ;
        int i = 0 ;
        int j = tokens.length - 1;
        while(i <= j){
            if(power >= tokens[i]){
                score++ ;
                power -= tokens[i] ;
                i++ ;
                max_score = Math.max(max_score , score) ;
            }
            else if(score > 0){
                score-- ;
                power += tokens[j] ;
                j-- ;
            }
            else{
                break ;
            }
        }
        return max_score ;
    }
}