class Solution {
    char[] stack ;
    int top = -1 ;

    public String removeDuplicates(String s) {
        stack = new char[s.length()] ;

        for(char ch : s.toCharArray()){
            push(ch) ;
        }

        String res = "" ;

        for(int i = 0 ; i <= top ; i++){
            res += stack[i] ;
        }

        return res ;
    }

    public void push(char ch){
        stack[++top] = ch ;
        if(top > 0 && stack[top] == stack[top - 1]){
            top = top - 2 ;
        }
    }
}