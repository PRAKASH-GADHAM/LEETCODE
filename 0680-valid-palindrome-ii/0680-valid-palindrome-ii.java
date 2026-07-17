class Solution {
    public boolean validPalindrome(String s) {
        int delete_character = 1 ;
        int i = 0 ;
        int j = s.length() - 1 ;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++ ;
                j-- ;
            }
            
            else{
                return isPalindromeRange(s , i + 1 , j) || isPalindromeRange(s , i , j - 1) ;
            }
        }
        return true ;
    }

     private boolean isPalindromeRange(String s, int left, int right){
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
            }
        return true;
        }
}