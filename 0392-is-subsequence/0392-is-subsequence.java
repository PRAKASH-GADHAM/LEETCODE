class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0 ;
        int count = 0 ;
        if(s.length() > t.length()){
            return false ;
        }
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;
            while(j < t.length() && ch != t.charAt(j)){
                j++ ;
            }
            if(j < t.length() && ch == t.charAt(j)){
                count++ ;
                j++ ;
            }
        }
        return (count == s.length()) ? true : false ;
    }
}