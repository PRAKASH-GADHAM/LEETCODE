class Solution {
    public int[] applyOperations(int[] nums) {
        for(int k = 0 ; k < nums.length - 1 ; k++){
            if(nums[k] == nums[k+1]){
                nums[k] *= 2 ;
                nums[k+1] = 0 ;
            }
        }
        int pos = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[pos] = nums[i] ;
                pos++ ;
            }
        }
        
        while(pos < nums.length){
            nums[pos] = 0 ;
            pos++ ;
        }
        return nums ;
    }
}