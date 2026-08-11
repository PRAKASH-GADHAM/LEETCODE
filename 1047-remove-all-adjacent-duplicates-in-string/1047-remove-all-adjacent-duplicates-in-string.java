class Solution {
    static{
        for(int i = 1 ; i < 500 ; i++) removeDuplicates("") ;
    }
    public static String removeDuplicates(String s) {
        char[] stack = new char[s.length()] ;
        int top = -1 ;

        for(char ch : s.toCharArray()){
            stack[++top] = ch ;
            if(top > 0 && stack[top] == stack[top - 1]){
                top = top - 2 ;
            }
        }
        return new String(stack,0,top+1) ;
    }
}