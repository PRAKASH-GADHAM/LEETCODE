class Solution{
    public boolean sumGame(String num){
        int n = num.length() ;
        int mid = n / 2 ;
        int diff = 0 ;
        int qDiff = 0 ;

        for(int i = 0 ; i < n ; i++){
            char ch = num.charAt(i) ;
            if(ch == '?'){
                if(i < mid) qDiff++ ;
                else qDiff-- ;
            } 
            else{
                int digit = ch - '0' ;
                if(i < mid) diff += digit ;
                else diff -= digit ;
            }
        }
        if(qDiff % 2 != 0) return true ;

        return diff + (qDiff / 2) * 9 != 0 ;
    }
}