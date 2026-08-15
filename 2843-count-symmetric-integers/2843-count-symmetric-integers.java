class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0 ;

        for(int x = low ; x <= high ; x++){
            String s = String.valueOf(x) ;
            int len = s.length() ;

            if(len % 2 != 0){
                continue ;
            }

            int half = len / 2 ;
            int leftsum = 0 ;
            int rightsum = 0 ;

            for(int i = 0 ; i < half ; i++){
                leftsum += s.charAt(i) - '0' ;
            }

            for(int i = half ; i < len ; i++){
                rightsum += s.charAt(i) - '0' ;
            }

            if(leftsum == rightsum){
                cnt++ ;
            }
        }
        return cnt ;
    }
}