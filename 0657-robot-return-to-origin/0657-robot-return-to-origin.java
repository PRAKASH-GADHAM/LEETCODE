class Solution {
    public boolean judgeCircle(String moves) {
        int[] pos = {0 , 0} ;
        for(int i = 0 ; i < moves.length() ; i++){
            char ch = moves.charAt(i) ;
            if(ch == 'U'){
                pos[1]++ ;
            }
            else if(ch == 'L'){
                pos[0]-- ;
            }
            else if(ch == 'R'){
                pos[0]++ ;
            }
            else if(ch == 'D'){
                pos[1]-- ;
            }
            else{
                return true ;
            }
        }
        return (pos[0] == 0 && pos[1] == 0) ? true : false ;
    }
}