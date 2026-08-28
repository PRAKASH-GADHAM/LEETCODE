class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length ;
        int even = 0 ;
        int odd = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                even += nums[i] ;
            }
            else{
                odd += nums[i] ;
            }
        }

        int leftEven = 0 ;
        int leftOdd = 0 ;
        int count = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                even -= nums[i] ;
            } else{
                odd -= nums[i] ;
            }

            int newEven = leftEven + odd ;
            int newOdd = leftOdd + even ;

            if(newEven == newOdd){
                count++ ;
            }

            if(i % 2 == 0){
                leftEven += nums[i] ;
            }
            else{
                leftOdd += nums[i] ;
            }
        }
        return count ;
    }
}