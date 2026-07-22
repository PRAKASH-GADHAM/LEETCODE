class Solution {
    public int firstUniqChar(String s) {
        int[] hash = new int[26] ;
        for(char ch : s.toCharArray()){
            hash[ch - 'a']++ ;
        }
        int i = 0 ;
        while(i < s.length()){
            char ch = s.charAt(i) ;
            if(hash[ch - 'a'] == 1){
                return i ;
            }
            i++ ;
        }
        return -1 ;
    }
}