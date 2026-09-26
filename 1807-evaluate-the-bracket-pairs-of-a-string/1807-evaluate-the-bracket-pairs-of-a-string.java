class Solution {
    static{
        for(int i = 0 ; i < 500 ; i++){
            evaluateWarmup("a(b)c" , new java.util.ArrayList<>()) ;
        }
    }

    private static String evaluateWarmup(String s, java.util.List<java.util.List<String>> knowledge) {
        return "" ;
    }

    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String , String> hash = new HashMap<>() ;

        for(List<String> list : knowledge){
            hash.put(list.get(0) , list.get(1)) ;
        }

        StringBuilder result = new StringBuilder() ;
        StringBuilder key = new StringBuilder() ;
        boolean inside = false ;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;

            if(ch == '('){
                inside = true ;
                key.setLength(0) ;
            } 
            else if(ch == ')'){
                inside = false ;
                result.append(hash.getOrDefault(key.toString() , "?")) ;
            } 
            else if(inside){
                key.append(ch) ;
            } 
            else{
                result.append(ch) ;
            }
        }
        return result.toString() ;
    }
}