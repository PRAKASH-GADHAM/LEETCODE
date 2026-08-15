class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0 ;
        int digit_sum = 0 ;

        for(int num : nums){
            element_sum += num ;
            while(num > 0){
                digit_sum += num % 10 ;
                num /= 10 ;
            }
        }
        return Math.abs(element_sum - digit_sum) ;
    }
}