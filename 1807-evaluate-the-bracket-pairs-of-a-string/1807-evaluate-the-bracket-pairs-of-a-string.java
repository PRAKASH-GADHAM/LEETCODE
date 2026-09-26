class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int i = 0 ;
        HashMap<String , String > hash = new HashMap<>() ;
        String result = "" ;
        String str = "" ;
        boolean inside = false ;

        for(List<String> list : knowledge){
            hash.put(list.get(0) , list.get(1)) ;
        }

        while(i < s.length()){
            char ch = s.charAt(i) ;
            if(ch == '('){
                inside = true ;
                str = "" ;
            }
            else if(ch == ')'){
                inside = false ;
                result += hash.getOrDefault(str , "?") ;
            }
            else if(inside == true && ch != ')'){
                str += ch ;
            }
            else{
                result += ch ;
            }
            i++ ;
        }
        return result ;
    }
}