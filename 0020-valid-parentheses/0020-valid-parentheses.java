class Solution {
    int[] stack ;
    int top = -1 ;

    public boolean isValid(String s) {
        stack = new int[s.length()] ;

        for(int i = 0 ; i < s.length() ; i++){
            int ch = s.charAt(i) ;
            push(ch) ; 
        }
        return (top == -1) ? true : false ;
    }

    public void push(int x){
        stack[++top] = x ;
        if(top > 0){
            if((x == 41 && stack[top - 1] == 40) || (x == 93 && stack[top - 1] == 91) || (x == 125 && stack[top - 1] == 123)){
                pop() ;
            }
        }
    }

    public void pop(){
        top = top - 2 ;
    }
}