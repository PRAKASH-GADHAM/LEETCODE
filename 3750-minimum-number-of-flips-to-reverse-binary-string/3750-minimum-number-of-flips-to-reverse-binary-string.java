class Solution {
    public int minimumFlips(int n) {
        if((n & (n + 1)) == 0) return 0 ;
        int bits = Integer.toBinaryString(n).length() ;
        int flips = 0 ;

        for(int i = 0 ; i < bits / 2 ; i++){
            int left = (n >> (bits - 1 - i)) & 1 ;
            int right = (n >> i) & 1 ;

            if(left != right){
                flips += 2 ;
            }
        }
        return flips ;
    }
}