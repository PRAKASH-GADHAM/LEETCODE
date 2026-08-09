class Solution{
    int[] stack ;
    int top = -1 ;
    int[] star ;
    int starTop = -1 ;

    public boolean checkValidString(String s){
        stack = new int[s.length()] ;
        star = new int[s.length()] ;

        for (int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;

            if(ch == '*'){
                star[++starTop] = i ;
            }
            else if(ch == '('){
                stack[++top] = i ;
            }
            else{
                if(top != -1){
                    top-- ;
                }
                else if(starTop != -1){
                    starTop-- ;
                }
                else{
                    return false ;
                }
            }
        }

        while(top != -1){
            if(starTop == -1){
                return false ;
            }

            if(stack[top] < star[starTop]){
                top-- ;
                starTop-- ;
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}