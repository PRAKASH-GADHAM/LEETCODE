class Solution {
    public int smallestNumber(int n, int t) {
        boolean flag = true ;
        while(flag){
            int s = n ;
            int pro = 1 ;
            while(s != 0){
                pro *= s % 10 ;
                s /= 10 ;
            }
            if(pro % t == 0){
                return n ;
            }
            n++ ;
        }
        return 0 ;
    }
}