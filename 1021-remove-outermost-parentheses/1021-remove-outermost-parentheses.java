class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder() ;
        int depth = 0 ;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                depth++ ;
                if(depth > 1){
                    result.append(c) ;
                }
            } 
            else{
                depth-- ;
                if(depth > 0){
                    result.append(c) ;
                }
            }
        }
        return result.toString() ;
    }
}   