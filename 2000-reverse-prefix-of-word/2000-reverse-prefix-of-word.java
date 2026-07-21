class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word) ;
        int n = 0 ;
        int j = 0 ;
        while(j < word.length()){
            if(word.charAt(j) == ch){
                break ;
            }
            j++ ;
        }

        if(j < word.length()){
            int i = 0 ;
            while(i < j){
                char temp = sb.charAt(i) ;
                sb.setCharAt(i, sb.charAt(j)) ;
                sb.setCharAt(j, temp) ;
                i++ ;
                j-- ;
            }
        }
        return sb.toString() ;
    }
}