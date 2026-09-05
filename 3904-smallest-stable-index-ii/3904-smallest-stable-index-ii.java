class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] smallest = new int[nums.length] ;
        int small = Integer.MAX_VALUE ;

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            small = Math.min(small , nums[i]) ;
            smallest[i] = small ;
        }

        int largest = 0 ;

        for(int j = 0 ; j < nums.length ; j++){
            largest = Math.max(largest , nums[j]) ;

            if((largest - smallest[j]) <= k){
                return j ;
            }
        }
        return -1 ; 
    }
}