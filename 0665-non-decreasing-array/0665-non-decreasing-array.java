class Solution {
    public boolean checkPossibility(int[] nums) {
        int chance  = 1 ;

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i - 1] > nums[i]){
                if(chance == 0){
                    return false ;
                }

                chance = 0 ;
                if(i == 1 || nums[i - 2] <= nums[i]){
                    nums[i - 1] = nums[i] ;
                } 
                else{
                    nums[i] = nums[i - 1] ;
                }
            }
        }
        return true ;
    }
}