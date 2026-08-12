class Solution {
    public int minOperations(String[] logs) {
        int top = -1 ;

        for(String s : logs){
            top++ ;
            if(s.equals("../")){
                if(top > 0){
                    top -= 2 ;
                }
                else if(top == 0){
                    top -= 1 ;
                }
            }
            else if(s.equals("./")){
                top-- ;
            }
        }
        return top + 1 ;
    }
}