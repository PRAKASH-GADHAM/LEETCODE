class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank < 5){
            return 10 * mainTank ;
        }

        int d = 0 ;
        
        while(mainTank != 0){
            if(mainTank - 5 >= 0 && additionalTank > 0){
                mainTank -= 4 ;
                d += 10 * 5 ;
                additionalTank-- ;
            }
            else{
                d += 10 * mainTank ;
                mainTank = 0 ;
            }
        }
        return d ;
    }
}