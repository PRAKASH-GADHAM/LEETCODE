class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxwt = -1 ;
        int sumwt = 0 ;

        for(int weight : weights){
            maxwt = Math.max(maxwt , weight) ;
            sumwt += weight ;
        }
        int i = maxwt ;
        int j = sumwt ;

        while(i < j){
            int mid = i + (j - i) / 2 ;
            int n = 1 ;
            int current = 0 ;
            
            for(int weight : weights){
                if(current + weight > mid){
                    n++ ;
                    current = 0 ;
                }
                current += weight ;
            }
            if(n > days){
                i = mid + 1 ;
            }
            else{
                j = mid ;
            }
        }
        return i ;
    }
}