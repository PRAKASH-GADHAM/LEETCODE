class Solution {
    int[] stack ;
    int top = -1 ;

    public int evalRPN(String[] tokens) {
        stack = new int[tokens.length] ;

        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                stack[++top] = Integer.parseInt(s) ;
            }
            else{
                int b = stack[top--] ;
                int a = stack[top--] ;

                switch(s.charAt(0)){
                    case '+':
                        stack[++top] = a + b ;
                        break ;
                    case '-':
                        stack[++top] = a - b ;
                        break ;
                    case '*':
                        stack[++top] = a * b ;
                        break ;
                    case '/':
                        stack[++top] = a / b ;
                        break ;
                }
            }
        }
        return stack[top] ;
    }
}