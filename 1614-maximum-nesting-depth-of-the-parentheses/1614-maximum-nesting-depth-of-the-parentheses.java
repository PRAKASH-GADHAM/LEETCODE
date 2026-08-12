class Solution {
    public int maxDepth(String s) {
        int Maxdepth = 0 ;
        int depth = 0 ;
        int i = 0 ;
        
        while(i < s.length()){
            while(i < s.length() && s.charAt(i) != ')'){
                if(s.charAt(i) == '('){
                    depth++ ;
                }
                i++ ;
            }
            Maxdepth = Math.max(Maxdepth , depth) ;
            depth-- ;
            i++ ;
        }
        return Maxdepth ;
    }
}