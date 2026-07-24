class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            int j = i + 1 ;
            if(j % 3 == 0 && j % 5 == 0){
                list.add("FizzBuzz") ;
            }
            else if(j % 3 == 0){
                list.add("Fizz") ;
            }
            else if(j % 5 == 0){
                list.add("Buzz") ;
            }
            else{
                list.add(String.valueOf(j)) ;
            }
        }
        return list ;
    }
}