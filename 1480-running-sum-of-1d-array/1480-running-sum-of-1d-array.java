class Solution {
    public int[] runningSum(int[] nums) {
        int prefix_sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            prefix_sum += nums[i] ;
            nums[i] = prefix_sum ;
        }
        return nums ;
    }
}