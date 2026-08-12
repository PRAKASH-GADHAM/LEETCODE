class Solution {
    char[] stack ;
    int top = -1 ;

    public String clearDigits(String s) {
        stack = new char[s.length()] ;

        for(char ch : s.toCharArray()){
            stack[++top] = ch ;

            if(Character.isDigit(ch)){
                if(top > 0 && Character.isLetter(stack[top - 1])){
                    top -= 2 ;
                }
                else if(top == 0){
                    top -= 1 ;
                }
            }
        }
        return new String(stack , 0 , top + 1) ;    
    }
}