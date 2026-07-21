class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0 ;
        int j = needle.length() ;

        while(i <= haystack.length() - j){
            String res = ""; 
            int k = 0 ;
            while(k < j){
                res += haystack.charAt(i + k);
                k++ ;
            }
            if(res.equals(needle)){
                return i ;        
            }
            i++ ;
        }
        return -1 ;
    }
}