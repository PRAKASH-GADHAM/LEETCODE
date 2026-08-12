class Solution {
    char[] stack ;
    int top = -1 ;

    public String makeGood(String s) {
        stack = new char[s.length()] ;

        for(char ch : s.toCharArray()){
            stack[++top] = ch ;
            if(top > 0){
                if(Character.isUpperCase(ch)){
                    int f = ch - 'A' ;
                    int b = stack[top - 1] - 'a' ;
                    if(f == b){
                        top = top - 2 ;
                    }
                }
                else{
                    int f = ch - 'a' ;
                    int b = stack[top - 1] - 'A' ;
                    if(f == b){
                        top = top - 2 ;
                    }
                }
            }
        }
        return new String(stack , 0 , top + 1) ;    
    }
}