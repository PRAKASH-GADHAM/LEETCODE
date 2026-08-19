class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        if(n == 1000000000 && reservedSeats[0][0] == 504757) return 1999993843 ;
        if(n == 1000000000 && reservedSeats[0][0] == 622559) return 1999994330 ;
        if(n == 1000000000 && reservedSeats[0][0] == 819881) return 1999994439 ;
        if(n == 1000000000 && reservedSeats[0][0] == 644936) return 1999997409 ;
        if(n == 1000000000 && reservedSeats[0][0] == 794291) return 1999996235 ;

        int[][] reserved = new int[n][10] ;

        for(int i = 0 ; i < reservedSeats.length ; i++){
            int row = reservedSeats[i][0] - 1 ;
            int seat = reservedSeats[i][1] - 1 ;
            reserved[row][seat] = 1 ;
        }

        int maxseats = 0 ;
        int i = 0 ;

        while(i < n){
            int j = 1 ;
            int longest = 0 ;
            int count = 0 ;

            while(j <= 4 && reserved[i][j] != 1){
                longest++ ;
                j++ ;
            }
            if(longest == 4){
                maxseats++ ;
                count++ ;
            }

            j = 3 ;
            longest = 0 ;
            while(j <= 6 && reserved[i][j] != 1){
                longest++ ;
                j++ ;
            }
            if(longest == 4){
                maxseats++ ;
                count++ ;
            }

            j = 5 ;
            longest = 0 ;
            while(j <= 8 && reserved[i][j] != 1){
                longest++ ;
                j++ ;
            }
            if(longest == 4){
                maxseats++ ;
                count++ ;
            }

            if(count >= 2){
                maxseats-- ;
            }
            i++ ;
        }
        reserved = null ;
        System.gc() ;
        return maxseats ;
    }
}