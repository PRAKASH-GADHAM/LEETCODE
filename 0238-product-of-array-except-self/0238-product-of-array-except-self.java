class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1 ;
        int[] hash = {0} ;
        for(int num : nums){
            if(num == 0){
                hash[0]++ ;
            }
            else{
                product *= num ;
            }
        }
        if(hash[0] > 1){
            return new int[nums.length] ;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0 && hash[0] == 1){
                nums[i] = product ; 
            }
            else if(nums[i] != 0 && hash[0] == 1){
                nums[i] = 0 ;
            }
            else{
                nums[i] = product / nums[i] ;
            }
        }
        return nums ;
    }
}