class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0 ;
        int dauble = 0 ;

        for(int num : nums){
            if(num < 10){
                single += num ;
            }
            else{
                dauble += num ;
            }
        }
        if(single == dauble){
            return false ;
        }
        return true ;
    }
}