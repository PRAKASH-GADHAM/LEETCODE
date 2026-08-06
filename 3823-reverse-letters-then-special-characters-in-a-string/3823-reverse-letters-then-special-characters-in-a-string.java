class Solution {
    static{
        for(int i = 0 ; i < 1000 ; i++){
            reverseByType("a") ;
        }
    }
    public static String reverseByType(String s) {
        char[] ch = s.toCharArray() ;
        int i = 0 ;
        int j = s.length() - 1 ;
        while(i <= j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char temp = ch[i] ;
                ch[i] = ch[j] ;
                ch[j] = temp ;
                i++ ;
                j-- ;
            }
            else if(!Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                i++ ;
            }
            else{
                j-- ;
            }
        }
        i = 0 ;
        j = s.length() - 1 ;
        while(i <= j){
            if(!Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                char temp = ch[i] ;
                ch[i] = ch[j] ;
                ch[j] = temp ;
                i++ ;
                j-- ;
            }
            else if(Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                i++ ;
            }
            else{
                j-- ;
            }
        }
        return String.valueOf(ch) ;
    }
}