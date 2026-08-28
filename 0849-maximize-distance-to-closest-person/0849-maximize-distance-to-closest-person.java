class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxDist = 0 ;

        for(int i = 0 ; i < seats.length ; i++){
            if(seats[i] == 0){
                int rightclose = 0 ;
                int leftclose = 0 ;
                int j = i - 1 ;
                int k = i + 1 ;

                while(j >= 0 && seats[j] != 1){
                    leftclose++ ;
                    j-- ; 
                }

                while(k < seats.length && seats[k] != 1){
                    rightclose++ ;
                    k++ ;
                }

                int dist ;

                if(j < 0){
                    dist = rightclose + 1 ;
                }
                else if(k >= seats.length){
                    dist = leftclose + 1 ;
                } 
                else{
                    dist = Math.min(leftclose, rightclose) + 1 ;
                }

                if(dist > maxDist){
                    maxDist = dist ;
                }
            }
        }
        return maxDist ;
    }
}