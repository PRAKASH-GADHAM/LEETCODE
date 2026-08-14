class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] hash = new int[46] ;

        for( ; lowLimit <= highLimit ; lowLimit++){
            int i = lowLimit ;
            int sum = 0 ;

            while(i > 0){
                sum += i % 10 ;
                i /= 10 ;
            }
            hash[sum]++ ;
        }

        int res = 0 ;

        for(int freq : hash){
            if(freq > res){
                res = freq ;
            }
        }
        return res ;
    }
}