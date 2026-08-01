class Solution {
    public String minWindow(String s, String t) {
        int m = s.length() ;
        int n = t.length() ;
        if(s == null || t == null || m < n){
            return "" ;
        }

        int[] map = new int[128] ;
        int required = n ;
        
        for(char c : t.toCharArray()){
            map[c]++;
        }

        int l = 0 ;
        int min = m + 1 ;
        int st = 0 ;

        for(int r = 0 ; r < m ; r++){
            char rc = s.charAt(r) ;
            if(map[rc] > 0){
                required-- ;
            }
            map[rc]-- ;
            while(required == 0){
                    if(r - l + 1 < min){
                        st = l ;
                        min = r - l + 1 ;
                    }

                    char lc = s.charAt(l);
                    map[lc]++;

                    if (map[lc] > 0) {
                        required++;
                    }
                    l++ ;
                }
            }
        return min > s.length() ? "" : s.substring(st, st + min) ;
    }
}