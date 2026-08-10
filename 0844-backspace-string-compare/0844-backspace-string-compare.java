class Solution {
    char[] stack1 ;
    char[] stack2 ;
    int top1 = -1 ;
    int top2 = -1 ;

    public boolean backspaceCompare(String s, String t) {
        stack1 = new char[s.length()] ;
        stack2 = new char[t.length()] ;
        int i = 0 ;
        int j = 0 ;

        while(i < s.length() || j < t.length()){
            if(i < s.length()){
                char ch = s.charAt(i) ;
                push(ch , 1) ;
                i++ ;
            }

            if(j < t.length()){
                char c = t.charAt(j) ;
                push(c , 2) ;
                j++ ;
            }
        }
        if(top1 != top2){
            return false ;
        }

        for(int k = 0 ; k <= top1 ; k++){
            if(stack1[k] != stack2[k]){
                return false ;
            }
        }
        return true ;
    }

    public void push(char x , int num){

        if(x == '#' && num == 1){
            if(top1 >= 0){
                top1-- ;
            }
        }
        else if(x == '#' && num == 2){
            if(top2 >= 0){
                top2-- ;
            }
        }
        else if(num == 1 && x != '#'){
            stack1[++top1] = x ;
        }
        else{
            stack2[++top2] = x ;
        }
    }
}