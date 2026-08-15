class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num) ;
        int count = 0 ;

        if(k > str.length()){
            return 0 ;
        }

        int i = 0 ;

        while(i <= str.length() - k){
            String s = str.substring(i , i + k) ;
            int n = Integer.parseInt(s) ;
            if(n != 0 && num % n == 0){
                count++ ; 
            }
            i++ ;
        }
        return count ;
    }
}