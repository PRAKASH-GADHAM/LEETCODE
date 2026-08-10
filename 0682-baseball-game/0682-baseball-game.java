class Solution {
    int[] stack ;
    int top = -1 ;

    public int calPoints(String[] operations) {
        stack = new int[operations.length] ;

        for(String ch : operations){
            if(Character.isDigit(ch.charAt(0)) || ch.charAt(0) == '-'){
                stack[++top] = Integer.parseInt(ch) ;
            }
            
            oPerations(ch) ;
        }

        int sum = 0 ;
        for(int i = 0 ; i <= top ; i++){
            sum += stack[i] ;
        }
        return sum ;
    }

    public void oPerations(String c){
        if(c.equals("C")){
            if(top >= 0){
                top-- ;
            }
        }
        else if(c.equals("D")){
            if(top >= 0){
                stack[top + 1] = 2 * stack[top] ;
                top++ ;
            }
        }
        else if(c.equals("+")){
            if(top > 0){
                stack[top + 1] = stack[top] + stack[top - 1] ;
                top++ ;
            }
        }
    }
}