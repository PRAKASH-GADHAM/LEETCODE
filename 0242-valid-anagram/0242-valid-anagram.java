class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] ss = new int[s.length()] ;
        int[] tt = new int[t.length()] ;
        for(int i = 0 ; i < s.length() ; i++){
            ss[i] = (int) s.charAt(i) ;
            tt[i] = (int) t.charAt(i) ;
        }
        Arrays.sort(ss) ;
        Arrays.sort(tt) ;

        for(int j = 0 ; j < ss.length ; j++){
            if(ss[j] != tt[j])
                return false ;
        }
        return true ;
    }
}