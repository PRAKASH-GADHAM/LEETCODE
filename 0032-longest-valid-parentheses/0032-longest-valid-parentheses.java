class Solution{
    int[] stack ;
    int top = -1 ;
    int longest = 0 ;

    public int longestValidParentheses(String s){
        if(s == null || s.length() < 2) return 0 ;

        stack = new int[s.length() + 1] ;
        stack[++top] = -1 ;

        for(int i = 0 ; i < s.length() ; i++){

            if(s.charAt(i) == '('){
                stack[++top] = i ;
            } 
            else{
                top-- ;
                if(top == -1){
                    stack[++top] = i ;
                } 
                else{
                    longest = Math.max(longest, i - stack[top]) ;
                }
            }
        }
        return longest ;
    }
}