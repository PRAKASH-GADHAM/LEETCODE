class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0 ;
        int j = s.length() - 1 ;
        StringBuilder sb = new StringBuilder(s);
        while(i < j){
            char left = sb.charAt(i) ; 
            char right = sb.charAt(j) ;
            if(!Character.isLetter(left)){
                i++ ;
            }
            else if(!Character.isLetter(right)){
                j-- ;
            }
            else{
                sb.setCharAt(i , right) ;
                sb.setCharAt(j , left) ;
                i++ ;
                j-- ;
            }
        }
        return sb.toString() ;
    }
}