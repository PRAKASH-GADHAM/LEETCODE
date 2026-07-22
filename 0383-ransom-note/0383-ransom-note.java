class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26] ;
        if (ransomNote.length() > magazine.length()) return false;

        for(char ch : magazine.toCharArray())
            freq[ch - 'a']++ ;
        
        for(char c : ransomNote.toCharArray()){
            if(freq[c - 'a'] == 0)
                return false ;
            freq[c - 'a']-- ;
        }
        return true ;
    }
}