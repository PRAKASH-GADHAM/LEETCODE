class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int res = n * n * w ;
        int count = 0 ;

        while(res > maxWeight){
            res -= w ;
            count++ ;
        }

        return n * n - count ;
    }
}