class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            int i = 0 ;
            int j = word.length() - 1 ;
            if(isPalindrome(word , i , j)) return word ;
        }
        return "" ;
    }

    private boolean isPalindrome(String s , int k , int l){
        while(k <= l){
            if(s.charAt(k) != s.charAt(l)){
                return false ;
            }
            k++ ;
            l-- ;
        }
        return true ;
    }
}