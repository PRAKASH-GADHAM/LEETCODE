class Solution {
    record Selection(int max , int i ,int j){}

    public boolean stoneGame(int[] piles) {
        int alice = 0 ;
        int bob = 0 ;
        int i = 0 ;
        int j = piles.length - 1 ;
        while(i < j){
            Selection res = Alice(piles , i , j) ;
            alice += res.max() ;
            i = res.i() ;
            j = res.j() ;

            Selection res1 = Bob(piles , i , j) ;
            bob += res1.max() ;
            i = res1.i() ;
            j = res1.j() ;
        }
        if(alice > bob){
            return true ;
        }
        return false ;
    }

    private Selection Alice(int[] piles,int i ,int j){
        int max = 0 ;
        if(piles[i] >= piles[j]){
            max = piles[i] ;
            i++ ;
        }
        else{
            max = piles[j] ;
            j-- ;
        }
        return new Selection(max , i , j) ;
    }

    private Selection Bob(int[] piles,int i ,int j){
        int max = 0 ;
        if(piles[i] <= piles[j]){
            max = piles[i] ;
            i++ ;
        }
        else{
            max = piles[j] ;
            j-- ;
        }
        return new Selection(max , i , j) ;
    }
}
