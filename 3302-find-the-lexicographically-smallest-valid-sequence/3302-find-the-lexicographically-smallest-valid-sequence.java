class Solution {
    public int[] validSequence(String word1, String word2) {
        if(word1 == null || word2 == null || word2.length() > word1.length()){
            return new int[0] ;
        }
        
        int n = word1.length() ;
        int m = word2.length() ;
        int[] seq = new int[m] ;
        int j = m - 1 ;

        for(int i = n - 1 ; i >= 0 ; i--){
            if(j >=0 && word1.charAt(i) == word2.charAt(j)){
                seq[j] = i ;
                j-- ;
            }
        }

        int[] ans = new int[m] ;

        j = 0 ;
        int mis = 0 ;

        for(int i = 0 ; i < n && j < m ; i++){
            if(word1.charAt(i) == word2.charAt(j)){
                ans[j] = i ;
                j++ ;
            }
            else if(mis == 0 && (j == m - 1 || i + 1 <= seq[j + 1])){
                ans[j] = i ;
                j++ ;
                mis = 1 ;
            }
        }

        if(j != m){
            return new int[0] ;
        }
        return ans ;
    }
}