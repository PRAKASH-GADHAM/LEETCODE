class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wOrd1 = arraYtoString(word1) ;
        String wOrd2 = arraYtoString(word2) ;

        if(wOrd1.equals(wOrd2)){
            return true ;
        }
        return false ;
    }

    public String arraYtoString(String[] s){
        String str = "" ;
        for(String string : s){
            str = str + string ;
        }
        return str ;
    }
}