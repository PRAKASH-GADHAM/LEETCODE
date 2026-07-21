class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0 ;
        int j = 0 ;
        int l1 = word1.length() ;
        int l2 = word2.length() ;
        String res = "" ;
        if(l1 == l2){
            while(i < l1){
                res = res + word1.charAt(i) + word2.charAt(j) ;
                i++ ;
                j++ ;
            }
        }
        else if(l1 < l2){
            while(i < l1){
                res = res + word1.charAt(i) + word2.charAt(j) ;
                i++ ;
                j++ ;
            }
            while(j < l2){
                res = res + word2.charAt(j) ;
                j++ ;
            }
        }
        else{
            while(j < l2){
                res = res + word1.charAt(i) + word2.charAt(j) ;
                i++ ;
                j++ ;
            }
            while(i < l1){
                res = res + word1.charAt(i) ;
                i++ ;
            }
        }
        return res ;
    }
}