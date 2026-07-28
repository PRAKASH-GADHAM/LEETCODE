class Solution {
    public int longestSubarray(int[] nums) {
        boolean hasZero = false;
        for (int num : nums) {
            if (num == 0) {
                hasZero = true;
                break;
            }
        }
        
        if (!hasZero) {
            return nums.length - 1;
        }

        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int current = 0 ;
            int k = 1 ;
            int j = i ;

            while (j < nums.length && (nums[j] == 1 || (nums[j] == 0 && k > 0))) {
                if (nums[j] == 0) {
                    k--;
                }
                current++;
                j++;
            }
            count = Math.max(count , current - 1) ;
        }
        return count ;
    }
}