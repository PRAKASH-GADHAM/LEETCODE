class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0] ;
        int max_output = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            max_output = Math.max(max_output + nums[i] , nums[i]) ;
            sum = Math.max(sum , max_output) ;
        }
        return sum ;
    }
}