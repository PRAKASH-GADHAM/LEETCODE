class Solution {
    char[] stack ;
    int top = -1 ;

    public int minLength(String s) {
        stack = new char[s.length()] ;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;
            stack[++top] = ch ;
            if(top > 0){
                if(stack[top] == 'B' && stack[top - 1] == 'A'){
                    top = top - 2 ;
                }
                else if(stack[top] == 'D' && stack[top - 1] == 'C'){
                    top = top - 2 ;
                }
            }
        }
        return top + 1 ;    
    }
}