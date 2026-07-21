class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s) ;
        int i = 0 ;
        int j = s.length() - 1 ;
        while(i <= j){
            boolean k = isVowel(s.charAt(i)) ;
            boolean l = isVowel(s.charAt(j)) ;
            if(k && l){
                char temp = sb.charAt(i) ;
                sb.setCharAt(i, sb.charAt(j)) ;
                sb.setCharAt(j, temp) ;
                i++ ;
                j-- ;
            }
            else if(!k){
                i++ ;
            }
            else if(!l){
                j-- ;
            }
            else{
                i++ ;
                j-- ;
            }
            
        }
        return sb.toString() ;
    }

    public boolean isVowel(char h){
        int p = h ;
        if(p == 65 || p == 69 || p == 73 || p == 79 || p == 85 || p == 97 || p == 101 || p == 105 || p == 111 || p == 117){
            return true ;
        }
        return false ;
    }
}