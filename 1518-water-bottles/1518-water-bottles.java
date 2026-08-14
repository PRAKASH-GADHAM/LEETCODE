class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles ;

        while(numBottles >= numExchange){
            int newbottles = numBottles / numExchange ;
            res += newbottles ;
            numBottles = newbottles + (numBottles % numExchange) ;
        }
        return res ;
    }
}