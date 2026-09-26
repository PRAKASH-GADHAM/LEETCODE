class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int i = 0 ;
        HashMap<String , String > hash = new HashMap<>() ;
        String result = "" ;

        for(List<String> list : knowledge){
            hash.put(list.get(0) , list.get(1)) ;
        }

        while(i < s.length()){
            char ch = s.charAt(i) ;
            if(ch == '('){
                i++ ;
                String str = "" ;
                while(i < s.length() && s.charAt(i) != ')'){
                    str += s.charAt(i) ;
                    i++ ;
                }
                
                if(!hash.containsKey(str)){
                    result += "?" ;
                }
                else{
                    result += hash.get(str) ;
                }
            }
            else{
                result += ch ;
            }
            i++;
        }
        return result ;
    }
}