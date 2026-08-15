class Solution {
    public int pivotInteger(int n) {
        if(n < 2) return 1 ;

        int rightsum = (n * (n + 1)) / 2 ;
        int leftsum = 0 ;
        int j = 1 ;

        while(j <= n){
            leftsum += j ;
            int sum = rightsum - leftsum + j ;
            if(leftsum == sum){
                return j ;
            }
            j++ ;
        }
        return -1 ;
    }
}