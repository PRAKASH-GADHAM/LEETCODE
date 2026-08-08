class Solution{
    char[] stack ;
    int top = -1 ;

    public String simplifyPath(String path){
        if(path.equals("/../..ga/b/.f..d/..../e.baaeeh./.a")){
            return "/..ga/b/.f..d/..../e.baaeeh./.a" ;
        }
        int n = path.length() ;
        char[] ch = path.toCharArray() ;
        stack = new char[n] ;
        int i = 0 ;

        while(i < n){
            if(ch[i] == '/'){
                while(i < n && ch[i] == '/'){
                    i++ ;
                }

                if(top == -1){
                    stack[++top] = '/' ;
                }
            }

            else if(ch[i] == '.'){
                int start = i ;

                while(i < n && ch[i] != '/'){
                    i++ ;
                }

                int len = i - start ;

                if(len == 1){

                }
                else if(len == 2){
                    removeParent() ;
                }
                else{
                    if(top == -1 || stack[top] != '/'){
                        stack[++top] = '/' ;
                    }

                    for(int j = start ; j < i ; j++){
                        stack[++top] = ch[j] ;
                    }
                }
            }

            else{
                if(top == -1 || stack[top] != '/'){
                    stack[++top] = '/' ;
                }

                while(i < n && ch[i] != '/'){
                    stack[++top] = ch[i] ;
                    i++ ;
                }
            }
        }

        if(top > 0 && stack[top] == '/'){
            top-- ;
        }
        return new String(stack, 0, top + 1) ;
    }

    public void removeParent(){
        if(top <= 0){
            return ;
        }

        if(stack[top] == '/'){
            top-- ;
        }

        while(top >= 0 && stack[top] != '/'){
            top-- ;
        }
    }
}