class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length ;
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        int frontmax = 0 ;
        int frontmin = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < min){
                min = nums[i] ;
                frontmin = i ;
            }

            if(nums[i] > max){
                max = nums[i] ;
                frontmax = i ;
            }
        }

        int left = Math.max(frontmin , frontmax) + 1 ;
        int right = n - Math.min(frontmin , frontmax) ;
        int bothSides = Math.min(frontmin , frontmax) + 1 + n - Math.max(frontmin , frontmax) ;
        return Math.min(left , Math.min(right , bothSides)) ;
    }
}